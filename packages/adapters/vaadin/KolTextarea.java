package com.example.adapters;

import com.vaadin.flow.component.Component;
import com.vaadin.flow.component.Tag;
import com.vaadin.flow.component.dependency.JsModule;
import com.vaadin.flow.component.dependency.NpmPackage;

import java.util.Optional;

/**
 * Die Komponente **Textarea** stellt ein größeres Eingabefeld für Inhalte zur Verfügung. Im Gegensatz zum <kol-link _href="/docs/components/input-text" _label="/docs/components/input-text" _label="InputText"></kol-link> können hier auch umfangreiche Inhalte eingegeben werden, die auch mit Zeilenumbrüchen versehen sein können.
 */

@Tag("kol-textarea")
@NpmPackage(value = "@public-ui/components", version = "1.6.0-rc.25")
@JsModule("@public-ui/components/dist/components/kol-textarea")
public class KolTextarea extends Component {
	/**
	 * Gibt an, mit welcher Tastenkombination man das interaktive Element der Komponente auslösen oder fokussieren kann.
	 *
	 * @param value String
	 */
	public void setAccessKey(final String value) {
		getElement().setProperty("_access-key", value.toString());
	}

	/**
	 * Gibt an, mit welcher Tastenkombination man das interaktive Element der Komponente auslösen oder fokussieren kann.
	 *
	 * @return Optional<String>
	 */
	public Optional<String> getAccessKey() {
		var value = getElement().getProperty("_access-key", null);
		return value.isEmpty() ? Optional.empty() : Optional.of(value);
	}

	/**
	 * Adjusts the height of the element to its content.
TODO: change back to AdjustHeightPropType after stencil #4663 has been resolved
	 *
	 * @param value String
	 */
	public void setAdjustHeight(final String value) {
		getElement().setProperty("_adjust-height", value.toString());
	}

	/**
	 * Adjusts the height of the element to its content.
TODO: change back to AdjustHeightPropType after stencil #4663 has been resolved
	 *
	 * @return Optional<String>
	 */
	public Optional<String> getAdjustHeight() {
		var value = getElement().getProperty("_adjust-height", null);
		return value.isEmpty() ? Optional.empty() : Optional.of(value);
	}

	/**
	 * Gibt an, ob der Screenreader die Meldung aktiv vorlesen soll.
	 *
	 * @param value String
	 */
	public void setAlert(final String value) {
		getElement().setProperty("_alert", value.toString());
	}

	/**
	 * Gibt an, ob der Screenreader die Meldung aktiv vorlesen soll.
	 *
	 * @return Optional<String>
	 */
	public Optional<String> getAlert() {
		var value = getElement().getProperty("_alert", null);
		return value.isEmpty() ? Optional.empty() : Optional.of(value);
	}

	/**
	 * Makes the element not focusable and ignore all events.
TODO: Change type back to `DisabledPropType` after Stencil#4663 has been resolved
	 *
	 * @param value String
	 */
	public void setDisabled(final String value) {
		getElement().setProperty("_disabled", value.toString());
	}

	/**
	 * Makes the element not focusable and ignore all events.
TODO: Change type back to `DisabledPropType` after Stencil#4663 has been resolved
	 *
	 * @return Optional<String>
	 */
	public Optional<String> getDisabled() {
		var value = getElement().getProperty("_disabled", null);
		return value.isEmpty() ? Optional.empty() : Optional.of(value);
	}

	/**
	 * Gibt den Text für eine Fehlermeldung an.
	 *
	 * @param value String
	 */
	public void setError(final String value) {
		getElement().setProperty("_error", value.toString());
	}

	/**
	 * Gibt den Text für eine Fehlermeldung an.
	 *
	 * @return Optional<String>
	 */
	public Optional<String> getError() {
		var value = getElement().getProperty("_error", null);
		return value.isEmpty() ? Optional.empty() : Optional.of(value);
	}

	/**
	 * Shows the character count on the lower border of the input.
TODO: Change type back to `HasCounterPropType` after Stencil#4663 has been resolved
	 *
	 * @param value String
	 */
	public void setHasCounter(final String value) {
		getElement().setProperty("_has-counter", value.toString());
	}

	/**
	 * Shows the character count on the lower border of the input.
TODO: Change type back to `HasCounterPropType` after Stencil#4663 has been resolved
	 *
	 * @return Optional<String>
	 */
	public Optional<String> getHasCounter() {
		var value = getElement().getProperty("_has-counter", null);
		return value.isEmpty() ? Optional.empty() : Optional.of(value);
	}

	/**
	 * Tells the element to hide the label.
TODO: Change type back to `HideLabelPropType` after Stencil#4663 has been resolved.
	 *
	 * @param value String
	 */
	public void setHideLabel(final String value) {
		getElement().setProperty("_hide-label", value.toString());
	}

	/**
	 * Tells the element to hide the label.
TODO: Change type back to `HideLabelPropType` after Stencil#4663 has been resolved.
	 *
	 * @return Optional<String>
	 */
	public Optional<String> getHideLabel() {
		var value = getElement().getProperty("_hide-label", null);
		return value.isEmpty() ? Optional.empty() : Optional.of(value);
	}

	/**
	 * Gibt den Hinweistext an.
	 *
	 * @param value String
	 */
	public void setHint(final String value) {
		getElement().setProperty("_hint", value.toString());
	}

	/**
	 * Gibt den Hinweistext an.
	 *
	 * @return Optional<String>
	 */
	public Optional<String> getHint() {
		var value = getElement().getProperty("_hint", null);
		return value.isEmpty() ? Optional.empty() : Optional.of(value);
	}

	/**
	 * Defines the internal ID of the primary component element.
	 *
	 * @param value String
	 */
	public void setId(final String value) {
		getElement().setProperty("_id", value.toString());
	}

	/**
	 * Defines the internal ID of the primary component element.
	 *
	 * @return Optional<String>
	 */
	public Optional<String> getId() {
		var value = getElement().getProperty("_id", null);
		return value.isEmpty() ? Optional.empty() : Optional.of(value);
	}

	/**
	 * Setzt die sichtbare oder semantische Beschriftung der Komponente (z.B. Aria-Label, Label, Headline, Caption, Summary usw.).
	 *
	 * @param value String
	 */
	public void setLabel(final String value) {
		getElement().setProperty("_label", value.toString());
	}

	/**
	 * Setzt die sichtbare oder semantische Beschriftung der Komponente (z.B. Aria-Label, Label, Headline, Caption, Summary usw.).
	 *
	 * @return Optional<String>
	 */
	public Optional<String> getLabel() {
		var value = getElement().getProperty("_label", null);
		return value.isEmpty() ? Optional.empty() : Optional.of(value);
	}

	/**
	 * Gibt an, wie viele Zeichen maximal eingegeben werden können.
	 *
	 * @param value String
	 */
	public void setMaxLength(final String value) {
		getElement().setProperty("_max-length", value.toString());
	}

	/**
	 * Gibt an, wie viele Zeichen maximal eingegeben werden können.
	 *
	 * @return Optional<String>
	 */
	public Optional<String> getMaxLength() {
		var value = getElement().getProperty("_max-length", null);
		return value.isEmpty() ? Optional.empty() : Optional.of(value);
	}

	/**
	 * Defines the technical name of an input field.
	 *
	 * @param value String
	 */
	public void setName(final String value) {
		getElement().setProperty("_name", value.toString());
	}

	/**
	 * Defines the technical name of an input field.
	 *
	 * @return Optional<String>
	 */
	public Optional<String> getName() {
		var value = getElement().getProperty("_name", null);
		return value.isEmpty() ? Optional.empty() : Optional.of(value);
	}

	/**
	 * Gibt den Platzhalter des Eingabefeldes an, wenn es leer ist.
	 *
	 * @param value String
	 */
	public void setPlaceholder(final String value) {
		getElement().setProperty("_placeholder", value.toString());
	}

	/**
	 * Gibt den Platzhalter des Eingabefeldes an, wenn es leer ist.
	 *
	 * @return Optional<String>
	 */
	public Optional<String> getPlaceholder() {
		var value = getElement().getProperty("_placeholder", null);
		return value.isEmpty() ? Optional.empty() : Optional.of(value);
	}

	/**
	 * Makes the input element read only.
TODO: Change type back to `ReadOnlyPropType` after Stencil#4663 has been resolved
	 *
	 * @param value String
	 */
	public void setReadOnly(final String value) {
		getElement().setProperty("_read-only", value.toString());
	}

	/**
	 * Makes the input element read only.
TODO: Change type back to `ReadOnlyPropType` after Stencil#4663 has been resolved
	 *
	 * @return Optional<String>
	 */
	public Optional<String> getReadOnly() {
		var value = getElement().getProperty("_read-only", null);
		return value.isEmpty() ? Optional.empty() : Optional.of(value);
	}

	/**
	 * Makes the input element required.
TODO: Change type back to `RequiredPropType` after Stencil#4663 has been resolved
	 *
	 * @param value String
	 */
	public void setRequired(final String value) {
		getElement().setProperty("_required", value.toString());
	}

	/**
	 * Makes the input element required.
TODO: Change type back to `RequiredPropType` after Stencil#4663 has been resolved
	 *
	 * @return Optional<String>
	 */
	public Optional<String> getRequired() {
		var value = getElement().getProperty("_required", null);
		return value.isEmpty() ? Optional.empty() : Optional.of(value);
	}

	/**
	 * Gibt an, ob die Größe des Eingabefeldes von Nutzer:innen geändert werden kann. (https://developer.mozilla.org/de/docs/Web/CSS/resize)
	 *
	 * @param value String
	 */
	public void setResize(final String value) {
		getElement().setProperty("_resize", value.toString());
	}

	/**
	 * Gibt an, ob die Größe des Eingabefeldes von Nutzer:innen geändert werden kann. (https://developer.mozilla.org/de/docs/Web/CSS/resize)
	 *
	 * @return Optional<String>
	 */
	public Optional<String> getResize() {
		var value = getElement().getProperty("_resize", null);
		return value.isEmpty() ? Optional.empty() : Optional.of(value);
	}

	/**
	 * Defines how many rows of text should be visible at the same time.
	 *
	 * @param value String
	 */
	public void setRows(final String value) {
		getElement().setProperty("_rows", value.toString());
	}

	/**
	 * Defines how many rows of text should be visible at the same time.
	 *
	 * @return Optional<String>
	 */
	public Optional<String> getRows() {
		var value = getElement().getProperty("_rows", null);
		return value.isEmpty() ? Optional.empty() : Optional.of(value);
	}

	/**
	 * Gibt an, welchen Tab-Index das primäre Element in der Komponente hat. (https://developer.mozilla.org/en-US/docs/Web/HTML/Global_attributes/tabindex)
	 *
	 * @param value String
	 */
	public void setTabIndex(final String value) {
		getElement().setProperty("_tab-index", value.toString());
	}

	/**
	 * Gibt an, welchen Tab-Index das primäre Element in der Komponente hat. (https://developer.mozilla.org/en-US/docs/Web/HTML/Global_attributes/tabindex)
	 *
	 * @return Optional<String>
	 */
	public Optional<String> getTabIndex() {
		var value = getElement().getProperty("_tab-index", null);
		return value.isEmpty() ? Optional.empty() : Optional.of(value);
	}

	/**
	 * Defines where to show the Tooltip preferably: top, right, bottom or left.
	 *
	 * @param value String
	 */
	public void setTooltipAlign(final String value) {
		getElement().setProperty("_tooltip-align", value.toString());
	}

	/**
	 * Defines where to show the Tooltip preferably: top, right, bottom or left.
	 *
	 * @return Optional<String>
	 */
	public Optional<String> getTooltipAlign() {
		var value = getElement().getProperty("_tooltip-align", null);
		return value.isEmpty() ? Optional.empty() : Optional.of(value);
	}

	/**
	 * Shows if the input was touched by a user.
TODO: Change type back to `TouchedPropType` after Stencil#4663 has been resolved
	 *
	 * @param value String
	 */
	public void setTouched(final String value) {
		getElement().setProperty("_touched", value.toString());
	}

	/**
	 * Shows if the input was touched by a user.
TODO: Change type back to `TouchedPropType` after Stencil#4663 has been resolved
	 *
	 * @return Optional<String>
	 */
	public Optional<String> getTouched() {
		var value = getElement().getProperty("_touched", null);
		return value.isEmpty() ? Optional.empty() : Optional.of(value);
	}

	/**
	 * Gibt den Wert des Eingabefeldes an.
	 *
	 * @param value String
	 */
	public void setValue(final String value) {
		getElement().setProperty("_value", value.toString());
	}

	/**
	 * Gibt den Wert des Eingabefeldes an.
	 *
	 * @return Optional<String>
	 */
	public Optional<String> getValue() {
		var value = getElement().getProperty("_value", null);
		return value.isEmpty() ? Optional.empty() : Optional.of(value);
	}
}
