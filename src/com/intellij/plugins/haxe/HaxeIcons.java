package com.intellij.plugins.haxe;

import com.intellij.icons.AllIcons;
import com.intellij.openapi.util.IconLoader;

import javax.swing.*;

public interface HaxeIcons {
  Icon NMML_ICON_16x16 = IconLoader.getIcon("/icons/nmml_16.png");
  Icon HAXE_ICON_16x16 = IconLoader.getIcon("/icons/haXe_16.png");
  Icon HAXE_ICON_24x24 = IconLoader.getIcon("/icons/haXe_24.png");

  Icon CLASS_ICON = IconLoader.getIcon("/icons/C_haXe.png");
  Icon ENUM_ICON = IconLoader.getIcon("/icons/E_haXe.png");
  Icon INTERFACE_ICON = IconLoader.getIcon("/icons/I_haXe.png");
  Icon TYPEDEF_ICON = AllIcons.Nodes.Annotationtype;

  Icon FUNCTION = AllIcons.Nodes.Function;
  Icon METHOD = AllIcons.Nodes.Method;
  Icon VARIABLE = AllIcons.Nodes.Variable;
  Icon FIELD = AllIcons.Nodes.Field;
  Icon PARAMETER = AllIcons.Nodes.Parameter;
}
