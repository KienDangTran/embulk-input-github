package org.embulk.input.github.repositories.delegate;

import org.embulk.base.restclient.RestClientInputPluginDelegate;
import org.embulk.base.restclient.RestClientInputTaskBase;
import org.embulk.base.restclient.ServiceDataSplitter;
import org.embulk.base.restclient.ServiceResponseMapper;
import org.embulk.base.restclient.record.RecordImporter;
import org.embulk.base.restclient.record.ValueLocator;
import org.embulk.config.ConfigDiff;
import org.embulk.config.TaskReport;
import org.embulk.spi.PageBuilder;
import org.embulk.spi.Schema;

import java.util.List;

public class BaseInputPlugin implements RestClientInputPluginDelegate<BaseInputPlugin.PluginTask> {
    @Override public ConfigDiff buildConfigDiff(
            PluginTask task, Schema schema, int taskCount, List<TaskReport> taskReports
    ) {
        return null;
    }

    @Override public void validateInputTask(PluginTask task) {

    }

    @Override public TaskReport ingestServiceData(
            PluginTask task, RecordImporter recordImporter, int taskIndex, PageBuilder pageBuilder
    ) {
        return null;
    }

    @Override
    public ServiceDataSplitter<PluginTask> buildServiceDataSplitter(PluginTask task) {
        return null;
    }

    @Override public ServiceResponseMapper<? extends ValueLocator> buildServiceResponseMapper(
            PluginTask task
    ) {
        return null;
    }

    public interface PluginTask extends RestClientInputTaskBase {}
}
