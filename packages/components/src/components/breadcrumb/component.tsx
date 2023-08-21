import { Component, Fragment, h, Host, JSX, Prop, State, Watch } from '@stencil/core';

import { LinkProps } from '../link/types';
import { Stringified } from '../../types/common';
import { LabelPropType, validateLabel } from '../../types/props/label';
import { a11yHintLabelingLandmarks } from '../../utils/a11y.tipps';
import { watchNavLinks } from '../nav/validation';
import { BreadcrumbLinkProps, API, States } from './types';

@Component({
	tag: 'kol-breadcrumb',
	styleUrls: {
		default: './style.css',
	},
	shadow: true,
})
export class KolBreadcrumb implements API {
	private readonly renderLink = (link: BreadcrumbLinkProps, index: number): JSX.Element => {
		const lastIndex = this.state._links.length - 1;
		const hideLabel = link._iconOnly || link._hideLabel;
		return (
			<li key={index}>
				{index !== 0 && <kol-icon _label="" _icon="codicon codicon-chevron-right" />}
				{index === lastIndex ? (
					<span>
						{hideLabel ? (
							<kol-icon _label={link._label} _icon={typeof link._icon === 'string' ? link._icon : 'codicon codicon-symbol-event'} />
						) : (
							<Fragment>{link._label}</Fragment>
						)}
					</span>
				) : (
					<kol-link {...link}></kol-link>
				)}
			</li>
		);
	};

	public render(): JSX.Element {
		return (
			<Host>
				<nav aria-label={this.state._label}>
					<ul>
						{this.state._links.length === 0 && (
							<li>
								<kol-icon _label="" _icon="codicon codicon-home" />…
							</li>
						)}
						{this.state._links.map(this.renderLink)}
					</ul>
				</nav>
			</Host>
		);
	}

	/**
	 * Setzt die semantische Beschriftung der Komponente.
	 *
	 * @deprecated use _label instead
	 */
	@Prop() public _ariaLabel?: string;

	/**
	 * Defines the visible or semantic label of the component (e.g. aria-label, label, headline, caption, summary, etc.).
	 */
	@Prop() public _label?: LabelPropType; // TODO: required in v2

	/**
	 * Defines the list of links combined with their labels to render.
	 */
	@Prop() public _links!: Stringified<BreadcrumbLinkProps[]>;

	@State() public state: States = {
		_label: '…', // ⚠ required
		_links: [],
	};

	/**
	 * @deprecated
	 */
	@Watch('_ariaLabel')
	public validateAriaLabel(value?: string): void {
		this.validateLabel(value);
	}

	@Watch('_label')
	public validateLabel(value?: LabelPropType): void {
		validateLabel(this, value);
		a11yHintLabelingLandmarks(value);
	}

	@Watch('_links')
	public validateLinks(value?: Stringified<LinkProps[]>): void {
		watchNavLinks('KolBreadcrumb', this, value);
	}

	public componentWillLoad(): void {
		this.validateLabel(this._label || this._ariaLabel);
		this.validateLinks(this._links);
	}
}
