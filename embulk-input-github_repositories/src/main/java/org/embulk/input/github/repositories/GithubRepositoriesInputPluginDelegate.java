package org.embulk.input.github.repositories;

import org.embulk.base.restclient.DispatchingRestClientInputPluginDelegate;
import org.embulk.base.restclient.RestClientInputPluginDelegate;
import org.embulk.input.github.repositories.delegate.BaseInputPlugin;

public class GithubRepositoriesInputPluginDelegate
        extends DispatchingRestClientInputPluginDelegate<BaseInputPlugin.PluginTask> {

    public static final String BASE_URL = "https://api.github.com";

    @Override
    protected RestClientInputPluginDelegate<BaseInputPlugin.PluginTask> dispatchPerTask(
            BaseInputPlugin.PluginTask
                    task
    ) {
        return null;
    }
}
