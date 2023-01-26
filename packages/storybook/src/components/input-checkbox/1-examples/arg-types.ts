export const argTypes = {
	_accessKey: {
		name: 'Tastenkombination Input',
		control: {
			type: 'text',
		},
		type: {
			required: true,
		},
		defaultValue: '',
	},
	autoFocus: {
		name: 'Input fokussierbar?',
		control: {
			type: 'boolean',
		},
		type: {
			required: true,
		},
		defaultValue: 0,
	},
	_checked: {
		name: 'Ausgewählt',
		control: {
			type: 'boolean',
		},
		type: {
			required: true,
		},
		defaultValue: 0,
	},
	_disabled: {
		name: 'Deaktiviert',
		control: {
			type: 'boolean',
		},
		type: {
			required: true,
		},
		defaultValue: 0,
	},
	_error: {
		name: 'Fehlermeldung',
		control: {
			type: 'text',
		},
		type: {
			required: true,
		},
		defaultValue: '',
	},
	_id: {
		name: 'ID',
		control: {
			type: 'text',
		},
		type: {
			required: true,
		},
		defaultValue: '',
	},
	_indeterminate: {
		name: 'Unbestimmter Status',
		control: {
			type: 'boolean',
		},
		type: {
			required: true,
		},
		defaultValue: 0,
	},
	_name: {
		name: 'Name (technisch)',
		control: {
			type: 'text',
		},
		type: {
			required: true,
		},
		defaultValue: '',
	},
	_tabIndex: {
		name: 'Tab-Index',
		control: {
			type: 'text',
		},
		type: {
			required: true,
		},
		defaultValue: 0,
	},
	_touched: {
		name: 'Besucht',
		control: {
			type: 'boolean',
		},
		type: {
			required: true,
		},
		defaultValue: 0,
	},
	_type: {
		name: 'Typ',
		control: {
			type: 'select',
		},
		options: ['checkbox', 'switch'],
		type: {
			required: true,
		},
		defaultValue: 'checkbox',
	},
	_value: {
		name: 'Wert',
		control: {
			type: 'text',
		},
		type: {
			required: true,
		},
		defaultValue: '',
	},
};
