package com.google.codelabs.migratingtojobs.jobs;


import com.google.codelabs.migratingtojobs.shared.CatalogListActivity;

public class JobsCatalogListActivity extends CatalogListActivity {
    @Override
    protected void inject() {
        JobsGlobalState.get(getApplication()).inject(this);
    }
}
