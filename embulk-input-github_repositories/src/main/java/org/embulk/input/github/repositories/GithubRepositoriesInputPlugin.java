package org.embulk.input.github.repositories;

import org.embulk.base.restclient.*;
import org.embulk.input.github.repositories.delegate.BaseInputPlugin;

public class GithubRepositoriesInputPlugin
        extends RestClientInputPluginBase<BaseInputPlugin.PluginTask>{

    public GithubRepositoriesInputPlugin() {
        super(BaseInputPlugin.PluginTask.class, new GithubRepositoriesInputPluginDelegate());
    }
}
