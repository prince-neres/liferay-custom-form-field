package dynamic.data.mapping.form.field.type;

import com.liferay.dynamic.data.mapping.annotations.DDMForm;
import com.liferay.dynamic.data.mapping.annotations.DDMFormLayout;
import com.liferay.dynamic.data.mapping.annotations.DDMFormLayoutPage;
import com.liferay.dynamic.data.mapping.annotations.DDMFormRule;
import com.liferay.dynamic.data.mapping.annotations.DDMFormLayoutRow;
import com.liferay.dynamic.data.mapping.annotations.DDMFormLayoutColumn;
import com.liferay.dynamic.data.mapping.annotations.DDMFormField;
import com.liferay.dynamic.data.mapping.form.field.type.DefaultDDMFormFieldTypeSettings;



@DDMForm(
    rules = {
        @DDMFormRule(
            actions = {
                "setVisible('predefinedValue', false)",
                "setVisible('validation', false)"
            },
            condition = "TRUE"
        )
    }
)
@DDMFormLayout(
    paginationMode = com.liferay.dynamic.data.mapping.model.DDMFormLayout.TABBED_MODE,
    value = {
        @DDMFormLayoutPage(
            title = "%basic",
            value = {
                @DDMFormLayoutRow(
                    {
                        @DDMFormLayoutColumn(
                            size = 12,
                            value = {
                                "label", "tip", "required", "allowGuestUsers"
                            }
                        )
                    }
                )
            }
        ),
        @DDMFormLayoutPage(
            title = "%advanced",
            value = {
                @DDMFormLayoutRow(
                    {
                        @DDMFormLayoutColumn(
                            size = 12,
                            value = {
                                "name", "fieldReference", "predefinedValue",
                                "visibilityExpression", "validation",
                                "fieldNamespace", "indexType", "localizable",
                                "readOnly", "dataType", "type", "showLabel",
                                "repeatable"
                            }
                        )
                    }
                )
            }
        )
    }
)
public interface UploadInputDDMFormFieldTypeSettings
    extends DefaultDDMFormFieldTypeSettings {

    @DDMFormField(
        dataType = "boolean", label = "%allow-guest-users-to-send-files",
        properties = "showAsSwitcher=true", type = "checkbox"
    )
    public boolean allowGuestUsers();

    @DDMFormField(
        label = "%repeatable",
        properties = {"showAsSwitcher=true", "showMaximumRepetitionsInfo=true"}
    )
    @Override
    public boolean repeatable();
}
