/*
 * BungeeTabListPlus - a BungeeCord plugin to customize the tablist
 *
 * Copyright (C) 2014 - 2015 Florian Stober
 *
 * This program is free software: you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License
 * along with this program.  If not, see <http://www.gnu.org/licenses/>.
 */

package codecrafter47.bungeetablistplus.config;

import codecrafter47.bungeetablistplus.config.components.Component;
import codecrafter47.bungeetablistplus.template.IconTemplate;
import codecrafter47.bungeetablistplus.yamlconfig.Validate;
import com.google.common.base.Preconditions;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
public class FixedColumnsConfig extends Config implements Validate {

    private int columns;

    private IconTemplate defaultIcon;

    private int defaultPing;

    private List<Component> components;

    @Override
    public void validate() {
        super.validate();
        Preconditions.checkArgument(columns > 0 && columns <= 4, "columns must b between 1 and 4 (is {0})", columns);
        Preconditions.checkNotNull(defaultIcon, "defaultIcon is null");
        Preconditions.checkNotNull(components, "components is null");
    }
}
