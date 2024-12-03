package org.smartbar.tables;

import vn.jeremy.smartbar.backoffice.api.TablesApi;
import vn.jeremy.smartbar.backoffice.model.Table;

import java.util.List;

public class TablesController implements TablesApi {
    @Override
    public List<Table> tablesGet() {
        return List.of();
    }

    @Override
    public void tablesPost(Table table) {

    }

    @Override
    public void tablesTableIdDelete(String tableId) {

    }

    @Override
    public Table tablesTableIdGet(String tableId) {
        return null;
    }

    @Override
    public void tablesTableIdPut(String tableId, Table table) {

    }
}
