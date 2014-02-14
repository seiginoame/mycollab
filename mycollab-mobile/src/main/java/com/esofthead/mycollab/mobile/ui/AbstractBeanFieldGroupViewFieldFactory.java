package com.esofthead.mycollab.mobile.ui;

import org.apache.commons.beanutils.BeanUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.esofthead.mycollab.core.arguments.NotBindable;
import com.esofthead.mycollab.core.utils.ClassUtils;
import com.esofthead.mycollab.mobile.ui.DefaultFormViewFieldFactory.FormViewField;
import com.vaadin.ui.Field;

/**
 * 
 * @author MyCollab Ltd.
 * @since 2.0
 * 
 */
public abstract class AbstractBeanFieldGroupViewFieldFactory<B> implements
		IBeanFieldGroupFieldFactory<B> {
	private static final long serialVersionUID = 1L;

	private static Logger log = LoggerFactory
			.getLogger(AbstractBeanFieldGroupViewFieldFactory.class);

	protected GenericBeanForm<B> attachForm;

	public AbstractBeanFieldGroupViewFieldFactory(GenericBeanForm<B> form) {
		this.attachForm = form;
	}

	@Override
	public void setBean(B bean) {
		Class<?> beanClass = bean.getClass();
		java.lang.reflect.Field[] fields = ClassUtils.getAllFields(beanClass);
		for (java.lang.reflect.Field field : fields) {
			Field<?> formField = onCreateField(field.getName());
			if (formField != null) {
				attachForm.attachField(field.getName(), formField);
			} else {
				if (field.getAnnotation(NotBindable.class) != null) {
					continue;
				} else {
					try {
						final String propertyValue = BeanUtils.getProperty(
								attachForm.getBean(), field.getName());
						formField = new FormViewField(propertyValue);
					} catch (Exception e) {
						log.error("Error while get field value", e);
						formField = new FormViewField("Error");
					}

					attachForm.attachField(field.getName(), formField);
				}
			}
		}
	}

	@Override
	public void commit() {

	}

	abstract protected Field<?> onCreateField(Object propertyId);

}
