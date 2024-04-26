package dynamic.data.mapping.form.field.type;

import com.liferay.dynamic.data.mapping.form.field.type.BaseDDMFormFieldType;
import com.liferay.dynamic.data.mapping.form.field.type.DDMFormFieldType;

import com.liferay.dynamic.data.mapping.form.field.type.DDMFormFieldTypeSettings;
import com.liferay.frontend.js.loader.modules.extender.npm.NPMResolver;
import org.osgi.service.component.annotations.Component;
import org.osgi.service.component.annotations.Reference;


@Component(
	immediate = true,
	property = {
		"ddm.form.field.type.description=upload-input-description",
		"ddm.form.field.type.display.order:Integer=10",
		"ddm.form.field.type.group=customized",
		"ddm.form.field.type.icon=upload",
		"ddm.form.field.type.label=upload-input-label",
		"ddm.form.field.type.name=upload-input",
	},
	service = DDMFormFieldType.class
)
public class UploadInputDDMFormFieldType extends BaseDDMFormFieldType {
	@Override
	public Class<? extends DDMFormFieldTypeSettings>
	getDDMFormFieldTypeSettings() {

		return UploadInputDDMFormFieldTypeSettings.class;
	}

	@Override
	public String getModuleName() {
		return _npmResolver.resolveModuleName(
			"dynamic-data-mapping-form-field/UploadInput/UploadInput.es");
	}

	@Override
	public String getName() {
		return "upload-input";
	}

	@Override
	public boolean isCustomDDMFormFieldType() {
		return true;
	}

	@Reference
	private NPMResolver _npmResolver;
}