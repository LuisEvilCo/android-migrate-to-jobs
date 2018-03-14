package com.google.codelabs.migratingtojobs.jobs;


import com.google.codelabs.migratingtojobs.shared.AppModule;
import com.google.codelabs.migratingtojobs.shared.RootComponent;

import javax.inject.Singleton;

import dagger.Component;

@Singleton
@Component(modules = {AppModule.class})
public interface JobsComponent extends RootComponent{
    public void inject(JobsGlobalState globalState);
    public void inject(JobsCatalogListActivity activity);
}
