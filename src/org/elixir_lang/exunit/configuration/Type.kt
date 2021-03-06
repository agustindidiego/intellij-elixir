package org.elixir_lang.exunit.configuration

import com.intellij.execution.configurations.ConfigurationFactory
import com.intellij.execution.configurations.ConfigurationType
import com.intellij.execution.configurations.ConfigurationTypeBase
import com.intellij.openapi.extensions.Extensions
import org.elixir_lang.icons.ElixirIcons

class Type : ConfigurationTypeBase(TYPE_ID, TYPE_NAME, "Runs Mix test", ElixirIcons.MIX_EX_UNIT) {
    override fun getConfigurationFactories(): Array<ConfigurationFactory> = arrayOf(Factory)

    companion object {
        private const val TYPE_ID = "MixExUnitRunConfigurationType"
        internal const val TYPE_NAME = "Elixir Mix ExUnit"

        val INSTANCE: Type
            get() = Extensions.findExtension<ConfigurationType, Type>(ConfigurationType.CONFIGURATION_TYPE_EP, Type::class.java)
    }
}
