package androidx.work.impl;

import androidx.work.impl.WorkDatabase_Impl;
import androidx.work.impl.model.DependencyDao_Impl;
import androidx.work.impl.model.PreferenceDao_Impl;
import androidx.work.impl.model.RawWorkInfoDao_Impl;
import androidx.work.impl.model.SystemIdInfoDao_Impl;
import androidx.work.impl.model.WorkNameDao_Impl;
import androidx.work.impl.model.WorkProgressDao_Impl;
import androidx.work.impl.model.WorkSpecDao_Impl;
import androidx.work.impl.model.WorkTagDao_Impl;
import com.unity3d.ads.metadata.MediationMetaData;
import defpackage.a87;
import defpackage.ce1;
import defpackage.d46;
import defpackage.e73;
import defpackage.fy5;
import defpackage.g85;
import defpackage.h87;
import defpackage.i33;
import defpackage.jx;
import defpackage.ly4;
import defpackage.m46;
import defpackage.n03;
import defpackage.os4;
import defpackage.oy3;
import defpackage.q77;
import defpackage.rb3;
import defpackage.s66;
import defpackage.sb2;
import defpackage.t66;
import defpackage.t77;
import defpackage.te4;
import defpackage.u66;
import defpackage.v66;
import defpackage.y65;
import defpackage.z05;
import defpackage.z65;
import defpackage.zz;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public final class WorkDatabase_Impl extends WorkDatabase {
    private final rb3 _dependencyDao;
    private final rb3 _preferenceDao;
    private final rb3 _rawWorkInfoDao;
    private final rb3 _systemIdInfoDao;
    private final rb3 _workNameDao;
    private final rb3 _workProgressDao;
    private final rb3 _workSpecDao;
    private final rb3 _workTagDao;

    public WorkDatabase_Impl() {
        final byte b = 0;
        this._workSpecDao = new d46(new sb2(this) { // from class: f77
            public final /* synthetic */ WorkDatabase_Impl y;

            {
                this.y = this;
            }

            @Override // defpackage.sb2
            public final Object invoke() {
                WorkSpecDao_Impl _workSpecDao$lambda$0;
                DependencyDao_Impl _dependencyDao$lambda$0;
                WorkTagDao_Impl _workTagDao$lambda$0;
                SystemIdInfoDao_Impl _systemIdInfoDao$lambda$0;
                WorkNameDao_Impl _workNameDao$lambda$0;
                WorkProgressDao_Impl _workProgressDao$lambda$0;
                PreferenceDao_Impl _preferenceDao$lambda$0;
                RawWorkInfoDao_Impl _rawWorkInfoDao$lambda$0;
                byte b2 = b;
                WorkDatabase_Impl workDatabase_Impl = this.y;
                switch (b2) {
                    case 0:
                        _workSpecDao$lambda$0 = WorkDatabase_Impl._workSpecDao$lambda$0(workDatabase_Impl);
                        return _workSpecDao$lambda$0;
                    case 1:
                        _dependencyDao$lambda$0 = WorkDatabase_Impl._dependencyDao$lambda$0(workDatabase_Impl);
                        return _dependencyDao$lambda$0;
                    case 2:
                        _workTagDao$lambda$0 = WorkDatabase_Impl._workTagDao$lambda$0(workDatabase_Impl);
                        return _workTagDao$lambda$0;
                    case 3:
                        _systemIdInfoDao$lambda$0 = WorkDatabase_Impl._systemIdInfoDao$lambda$0(workDatabase_Impl);
                        return _systemIdInfoDao$lambda$0;
                    case 4:
                        _workNameDao$lambda$0 = WorkDatabase_Impl._workNameDao$lambda$0(workDatabase_Impl);
                        return _workNameDao$lambda$0;
                    case 5:
                        _workProgressDao$lambda$0 = WorkDatabase_Impl._workProgressDao$lambda$0(workDatabase_Impl);
                        return _workProgressDao$lambda$0;
                    case 6:
                        _preferenceDao$lambda$0 = WorkDatabase_Impl._preferenceDao$lambda$0(workDatabase_Impl);
                        return _preferenceDao$lambda$0;
                    default:
                        _rawWorkInfoDao$lambda$0 = WorkDatabase_Impl._rawWorkInfoDao$lambda$0(workDatabase_Impl);
                        return _rawWorkInfoDao$lambda$0;
                }
            }
        });
        final byte b2 = 1;
        this._dependencyDao = new d46(new sb2(this) { // from class: f77
            public final /* synthetic */ WorkDatabase_Impl y;

            {
                this.y = this;
            }

            @Override // defpackage.sb2
            public final Object invoke() {
                WorkSpecDao_Impl _workSpecDao$lambda$0;
                DependencyDao_Impl _dependencyDao$lambda$0;
                WorkTagDao_Impl _workTagDao$lambda$0;
                SystemIdInfoDao_Impl _systemIdInfoDao$lambda$0;
                WorkNameDao_Impl _workNameDao$lambda$0;
                WorkProgressDao_Impl _workProgressDao$lambda$0;
                PreferenceDao_Impl _preferenceDao$lambda$0;
                RawWorkInfoDao_Impl _rawWorkInfoDao$lambda$0;
                byte b22 = b2;
                WorkDatabase_Impl workDatabase_Impl = this.y;
                switch (b22) {
                    case 0:
                        _workSpecDao$lambda$0 = WorkDatabase_Impl._workSpecDao$lambda$0(workDatabase_Impl);
                        return _workSpecDao$lambda$0;
                    case 1:
                        _dependencyDao$lambda$0 = WorkDatabase_Impl._dependencyDao$lambda$0(workDatabase_Impl);
                        return _dependencyDao$lambda$0;
                    case 2:
                        _workTagDao$lambda$0 = WorkDatabase_Impl._workTagDao$lambda$0(workDatabase_Impl);
                        return _workTagDao$lambda$0;
                    case 3:
                        _systemIdInfoDao$lambda$0 = WorkDatabase_Impl._systemIdInfoDao$lambda$0(workDatabase_Impl);
                        return _systemIdInfoDao$lambda$0;
                    case 4:
                        _workNameDao$lambda$0 = WorkDatabase_Impl._workNameDao$lambda$0(workDatabase_Impl);
                        return _workNameDao$lambda$0;
                    case 5:
                        _workProgressDao$lambda$0 = WorkDatabase_Impl._workProgressDao$lambda$0(workDatabase_Impl);
                        return _workProgressDao$lambda$0;
                    case 6:
                        _preferenceDao$lambda$0 = WorkDatabase_Impl._preferenceDao$lambda$0(workDatabase_Impl);
                        return _preferenceDao$lambda$0;
                    default:
                        _rawWorkInfoDao$lambda$0 = WorkDatabase_Impl._rawWorkInfoDao$lambda$0(workDatabase_Impl);
                        return _rawWorkInfoDao$lambda$0;
                }
            }
        });
        final byte b3 = 2;
        this._workTagDao = new d46(new sb2(this) { // from class: f77
            public final /* synthetic */ WorkDatabase_Impl y;

            {
                this.y = this;
            }

            @Override // defpackage.sb2
            public final Object invoke() {
                WorkSpecDao_Impl _workSpecDao$lambda$0;
                DependencyDao_Impl _dependencyDao$lambda$0;
                WorkTagDao_Impl _workTagDao$lambda$0;
                SystemIdInfoDao_Impl _systemIdInfoDao$lambda$0;
                WorkNameDao_Impl _workNameDao$lambda$0;
                WorkProgressDao_Impl _workProgressDao$lambda$0;
                PreferenceDao_Impl _preferenceDao$lambda$0;
                RawWorkInfoDao_Impl _rawWorkInfoDao$lambda$0;
                byte b22 = b3;
                WorkDatabase_Impl workDatabase_Impl = this.y;
                switch (b22) {
                    case 0:
                        _workSpecDao$lambda$0 = WorkDatabase_Impl._workSpecDao$lambda$0(workDatabase_Impl);
                        return _workSpecDao$lambda$0;
                    case 1:
                        _dependencyDao$lambda$0 = WorkDatabase_Impl._dependencyDao$lambda$0(workDatabase_Impl);
                        return _dependencyDao$lambda$0;
                    case 2:
                        _workTagDao$lambda$0 = WorkDatabase_Impl._workTagDao$lambda$0(workDatabase_Impl);
                        return _workTagDao$lambda$0;
                    case 3:
                        _systemIdInfoDao$lambda$0 = WorkDatabase_Impl._systemIdInfoDao$lambda$0(workDatabase_Impl);
                        return _systemIdInfoDao$lambda$0;
                    case 4:
                        _workNameDao$lambda$0 = WorkDatabase_Impl._workNameDao$lambda$0(workDatabase_Impl);
                        return _workNameDao$lambda$0;
                    case 5:
                        _workProgressDao$lambda$0 = WorkDatabase_Impl._workProgressDao$lambda$0(workDatabase_Impl);
                        return _workProgressDao$lambda$0;
                    case 6:
                        _preferenceDao$lambda$0 = WorkDatabase_Impl._preferenceDao$lambda$0(workDatabase_Impl);
                        return _preferenceDao$lambda$0;
                    default:
                        _rawWorkInfoDao$lambda$0 = WorkDatabase_Impl._rawWorkInfoDao$lambda$0(workDatabase_Impl);
                        return _rawWorkInfoDao$lambda$0;
                }
            }
        });
        final byte b4 = 3;
        this._systemIdInfoDao = new d46(new sb2(this) { // from class: f77
            public final /* synthetic */ WorkDatabase_Impl y;

            {
                this.y = this;
            }

            @Override // defpackage.sb2
            public final Object invoke() {
                WorkSpecDao_Impl _workSpecDao$lambda$0;
                DependencyDao_Impl _dependencyDao$lambda$0;
                WorkTagDao_Impl _workTagDao$lambda$0;
                SystemIdInfoDao_Impl _systemIdInfoDao$lambda$0;
                WorkNameDao_Impl _workNameDao$lambda$0;
                WorkProgressDao_Impl _workProgressDao$lambda$0;
                PreferenceDao_Impl _preferenceDao$lambda$0;
                RawWorkInfoDao_Impl _rawWorkInfoDao$lambda$0;
                byte b22 = b4;
                WorkDatabase_Impl workDatabase_Impl = this.y;
                switch (b22) {
                    case 0:
                        _workSpecDao$lambda$0 = WorkDatabase_Impl._workSpecDao$lambda$0(workDatabase_Impl);
                        return _workSpecDao$lambda$0;
                    case 1:
                        _dependencyDao$lambda$0 = WorkDatabase_Impl._dependencyDao$lambda$0(workDatabase_Impl);
                        return _dependencyDao$lambda$0;
                    case 2:
                        _workTagDao$lambda$0 = WorkDatabase_Impl._workTagDao$lambda$0(workDatabase_Impl);
                        return _workTagDao$lambda$0;
                    case 3:
                        _systemIdInfoDao$lambda$0 = WorkDatabase_Impl._systemIdInfoDao$lambda$0(workDatabase_Impl);
                        return _systemIdInfoDao$lambda$0;
                    case 4:
                        _workNameDao$lambda$0 = WorkDatabase_Impl._workNameDao$lambda$0(workDatabase_Impl);
                        return _workNameDao$lambda$0;
                    case 5:
                        _workProgressDao$lambda$0 = WorkDatabase_Impl._workProgressDao$lambda$0(workDatabase_Impl);
                        return _workProgressDao$lambda$0;
                    case 6:
                        _preferenceDao$lambda$0 = WorkDatabase_Impl._preferenceDao$lambda$0(workDatabase_Impl);
                        return _preferenceDao$lambda$0;
                    default:
                        _rawWorkInfoDao$lambda$0 = WorkDatabase_Impl._rawWorkInfoDao$lambda$0(workDatabase_Impl);
                        return _rawWorkInfoDao$lambda$0;
                }
            }
        });
        final byte b5 = 4;
        this._workNameDao = new d46(new sb2(this) { // from class: f77
            public final /* synthetic */ WorkDatabase_Impl y;

            {
                this.y = this;
            }

            @Override // defpackage.sb2
            public final Object invoke() {
                WorkSpecDao_Impl _workSpecDao$lambda$0;
                DependencyDao_Impl _dependencyDao$lambda$0;
                WorkTagDao_Impl _workTagDao$lambda$0;
                SystemIdInfoDao_Impl _systemIdInfoDao$lambda$0;
                WorkNameDao_Impl _workNameDao$lambda$0;
                WorkProgressDao_Impl _workProgressDao$lambda$0;
                PreferenceDao_Impl _preferenceDao$lambda$0;
                RawWorkInfoDao_Impl _rawWorkInfoDao$lambda$0;
                byte b22 = b5;
                WorkDatabase_Impl workDatabase_Impl = this.y;
                switch (b22) {
                    case 0:
                        _workSpecDao$lambda$0 = WorkDatabase_Impl._workSpecDao$lambda$0(workDatabase_Impl);
                        return _workSpecDao$lambda$0;
                    case 1:
                        _dependencyDao$lambda$0 = WorkDatabase_Impl._dependencyDao$lambda$0(workDatabase_Impl);
                        return _dependencyDao$lambda$0;
                    case 2:
                        _workTagDao$lambda$0 = WorkDatabase_Impl._workTagDao$lambda$0(workDatabase_Impl);
                        return _workTagDao$lambda$0;
                    case 3:
                        _systemIdInfoDao$lambda$0 = WorkDatabase_Impl._systemIdInfoDao$lambda$0(workDatabase_Impl);
                        return _systemIdInfoDao$lambda$0;
                    case 4:
                        _workNameDao$lambda$0 = WorkDatabase_Impl._workNameDao$lambda$0(workDatabase_Impl);
                        return _workNameDao$lambda$0;
                    case 5:
                        _workProgressDao$lambda$0 = WorkDatabase_Impl._workProgressDao$lambda$0(workDatabase_Impl);
                        return _workProgressDao$lambda$0;
                    case 6:
                        _preferenceDao$lambda$0 = WorkDatabase_Impl._preferenceDao$lambda$0(workDatabase_Impl);
                        return _preferenceDao$lambda$0;
                    default:
                        _rawWorkInfoDao$lambda$0 = WorkDatabase_Impl._rawWorkInfoDao$lambda$0(workDatabase_Impl);
                        return _rawWorkInfoDao$lambda$0;
                }
            }
        });
        final byte b6 = 5;
        this._workProgressDao = new d46(new sb2(this) { // from class: f77
            public final /* synthetic */ WorkDatabase_Impl y;

            {
                this.y = this;
            }

            @Override // defpackage.sb2
            public final Object invoke() {
                WorkSpecDao_Impl _workSpecDao$lambda$0;
                DependencyDao_Impl _dependencyDao$lambda$0;
                WorkTagDao_Impl _workTagDao$lambda$0;
                SystemIdInfoDao_Impl _systemIdInfoDao$lambda$0;
                WorkNameDao_Impl _workNameDao$lambda$0;
                WorkProgressDao_Impl _workProgressDao$lambda$0;
                PreferenceDao_Impl _preferenceDao$lambda$0;
                RawWorkInfoDao_Impl _rawWorkInfoDao$lambda$0;
                byte b22 = b6;
                WorkDatabase_Impl workDatabase_Impl = this.y;
                switch (b22) {
                    case 0:
                        _workSpecDao$lambda$0 = WorkDatabase_Impl._workSpecDao$lambda$0(workDatabase_Impl);
                        return _workSpecDao$lambda$0;
                    case 1:
                        _dependencyDao$lambda$0 = WorkDatabase_Impl._dependencyDao$lambda$0(workDatabase_Impl);
                        return _dependencyDao$lambda$0;
                    case 2:
                        _workTagDao$lambda$0 = WorkDatabase_Impl._workTagDao$lambda$0(workDatabase_Impl);
                        return _workTagDao$lambda$0;
                    case 3:
                        _systemIdInfoDao$lambda$0 = WorkDatabase_Impl._systemIdInfoDao$lambda$0(workDatabase_Impl);
                        return _systemIdInfoDao$lambda$0;
                    case 4:
                        _workNameDao$lambda$0 = WorkDatabase_Impl._workNameDao$lambda$0(workDatabase_Impl);
                        return _workNameDao$lambda$0;
                    case 5:
                        _workProgressDao$lambda$0 = WorkDatabase_Impl._workProgressDao$lambda$0(workDatabase_Impl);
                        return _workProgressDao$lambda$0;
                    case 6:
                        _preferenceDao$lambda$0 = WorkDatabase_Impl._preferenceDao$lambda$0(workDatabase_Impl);
                        return _preferenceDao$lambda$0;
                    default:
                        _rawWorkInfoDao$lambda$0 = WorkDatabase_Impl._rawWorkInfoDao$lambda$0(workDatabase_Impl);
                        return _rawWorkInfoDao$lambda$0;
                }
            }
        });
        final byte b7 = 6;
        this._preferenceDao = new d46(new sb2(this) { // from class: f77
            public final /* synthetic */ WorkDatabase_Impl y;

            {
                this.y = this;
            }

            @Override // defpackage.sb2
            public final Object invoke() {
                WorkSpecDao_Impl _workSpecDao$lambda$0;
                DependencyDao_Impl _dependencyDao$lambda$0;
                WorkTagDao_Impl _workTagDao$lambda$0;
                SystemIdInfoDao_Impl _systemIdInfoDao$lambda$0;
                WorkNameDao_Impl _workNameDao$lambda$0;
                WorkProgressDao_Impl _workProgressDao$lambda$0;
                PreferenceDao_Impl _preferenceDao$lambda$0;
                RawWorkInfoDao_Impl _rawWorkInfoDao$lambda$0;
                byte b22 = b7;
                WorkDatabase_Impl workDatabase_Impl = this.y;
                switch (b22) {
                    case 0:
                        _workSpecDao$lambda$0 = WorkDatabase_Impl._workSpecDao$lambda$0(workDatabase_Impl);
                        return _workSpecDao$lambda$0;
                    case 1:
                        _dependencyDao$lambda$0 = WorkDatabase_Impl._dependencyDao$lambda$0(workDatabase_Impl);
                        return _dependencyDao$lambda$0;
                    case 2:
                        _workTagDao$lambda$0 = WorkDatabase_Impl._workTagDao$lambda$0(workDatabase_Impl);
                        return _workTagDao$lambda$0;
                    case 3:
                        _systemIdInfoDao$lambda$0 = WorkDatabase_Impl._systemIdInfoDao$lambda$0(workDatabase_Impl);
                        return _systemIdInfoDao$lambda$0;
                    case 4:
                        _workNameDao$lambda$0 = WorkDatabase_Impl._workNameDao$lambda$0(workDatabase_Impl);
                        return _workNameDao$lambda$0;
                    case 5:
                        _workProgressDao$lambda$0 = WorkDatabase_Impl._workProgressDao$lambda$0(workDatabase_Impl);
                        return _workProgressDao$lambda$0;
                    case 6:
                        _preferenceDao$lambda$0 = WorkDatabase_Impl._preferenceDao$lambda$0(workDatabase_Impl);
                        return _preferenceDao$lambda$0;
                    default:
                        _rawWorkInfoDao$lambda$0 = WorkDatabase_Impl._rawWorkInfoDao$lambda$0(workDatabase_Impl);
                        return _rawWorkInfoDao$lambda$0;
                }
            }
        });
        final byte b8 = 7;
        this._rawWorkInfoDao = new d46(new sb2(this) { // from class: f77
            public final /* synthetic */ WorkDatabase_Impl y;

            {
                this.y = this;
            }

            @Override // defpackage.sb2
            public final Object invoke() {
                WorkSpecDao_Impl _workSpecDao$lambda$0;
                DependencyDao_Impl _dependencyDao$lambda$0;
                WorkTagDao_Impl _workTagDao$lambda$0;
                SystemIdInfoDao_Impl _systemIdInfoDao$lambda$0;
                WorkNameDao_Impl _workNameDao$lambda$0;
                WorkProgressDao_Impl _workProgressDao$lambda$0;
                PreferenceDao_Impl _preferenceDao$lambda$0;
                RawWorkInfoDao_Impl _rawWorkInfoDao$lambda$0;
                byte b22 = b8;
                WorkDatabase_Impl workDatabase_Impl = this.y;
                switch (b22) {
                    case 0:
                        _workSpecDao$lambda$0 = WorkDatabase_Impl._workSpecDao$lambda$0(workDatabase_Impl);
                        return _workSpecDao$lambda$0;
                    case 1:
                        _dependencyDao$lambda$0 = WorkDatabase_Impl._dependencyDao$lambda$0(workDatabase_Impl);
                        return _dependencyDao$lambda$0;
                    case 2:
                        _workTagDao$lambda$0 = WorkDatabase_Impl._workTagDao$lambda$0(workDatabase_Impl);
                        return _workTagDao$lambda$0;
                    case 3:
                        _systemIdInfoDao$lambda$0 = WorkDatabase_Impl._systemIdInfoDao$lambda$0(workDatabase_Impl);
                        return _systemIdInfoDao$lambda$0;
                    case 4:
                        _workNameDao$lambda$0 = WorkDatabase_Impl._workNameDao$lambda$0(workDatabase_Impl);
                        return _workNameDao$lambda$0;
                    case 5:
                        _workProgressDao$lambda$0 = WorkDatabase_Impl._workProgressDao$lambda$0(workDatabase_Impl);
                        return _workProgressDao$lambda$0;
                    case 6:
                        _preferenceDao$lambda$0 = WorkDatabase_Impl._preferenceDao$lambda$0(workDatabase_Impl);
                        return _preferenceDao$lambda$0;
                    default:
                        _rawWorkInfoDao$lambda$0 = WorkDatabase_Impl._rawWorkInfoDao$lambda$0(workDatabase_Impl);
                        return _rawWorkInfoDao$lambda$0;
                }
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final DependencyDao_Impl _dependencyDao$lambda$0(WorkDatabase_Impl workDatabase_Impl) {
        return new DependencyDao_Impl(workDatabase_Impl);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final PreferenceDao_Impl _preferenceDao$lambda$0(WorkDatabase_Impl workDatabase_Impl) {
        return new PreferenceDao_Impl(workDatabase_Impl);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final RawWorkInfoDao_Impl _rawWorkInfoDao$lambda$0(WorkDatabase_Impl workDatabase_Impl) {
        return new RawWorkInfoDao_Impl(workDatabase_Impl);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final SystemIdInfoDao_Impl _systemIdInfoDao$lambda$0(WorkDatabase_Impl workDatabase_Impl) {
        return new SystemIdInfoDao_Impl(workDatabase_Impl);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final WorkNameDao_Impl _workNameDao$lambda$0(WorkDatabase_Impl workDatabase_Impl) {
        return new WorkNameDao_Impl(workDatabase_Impl);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final WorkProgressDao_Impl _workProgressDao$lambda$0(WorkDatabase_Impl workDatabase_Impl) {
        return new WorkProgressDao_Impl(workDatabase_Impl);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final WorkSpecDao_Impl _workSpecDao$lambda$0(WorkDatabase_Impl workDatabase_Impl) {
        return new WorkSpecDao_Impl(workDatabase_Impl);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final WorkTagDao_Impl _workTagDao$lambda$0(WorkDatabase_Impl workDatabase_Impl) {
        return new WorkTagDao_Impl(workDatabase_Impl);
    }

    public void clearAllTables() {
        performClear(true, "Dependency", "WorkSpec", "WorkTag", "SystemIdInfo", "WorkName", "WorkProgress", "Preference");
    }

    @Override // defpackage.v65
    public List<oy3> createAutoMigrations(Map<e73, ? extends jx> map) {
        map.getClass();
        ArrayList arrayList = new ArrayList();
        arrayList.add(new WorkDatabase_AutoMigration_13_14_Impl());
        arrayList.add(new WorkDatabase_AutoMigration_14_15_Impl());
        arrayList.add(new WorkDatabase_AutoMigration_16_17_Impl());
        arrayList.add(new WorkDatabase_AutoMigration_17_18_Impl());
        arrayList.add(new WorkDatabase_AutoMigration_18_19_Impl());
        arrayList.add(new WorkDatabase_AutoMigration_19_20_Impl());
        arrayList.add(new WorkDatabase_AutoMigration_20_21_Impl());
        arrayList.add(new WorkDatabase_AutoMigration_22_23_Impl());
        arrayList.add(new WorkDatabase_AutoMigration_23_24_Impl());
        return arrayList;
    }

    @Override // defpackage.v65
    public i33 createInvalidationTracker() {
        return new i33(this, new LinkedHashMap(), new LinkedHashMap(), "Dependency", "WorkSpec", "WorkTag", "SystemIdInfo", "WorkName", "WorkProgress", "Preference");
    }

    @Override // defpackage.v65
    public z65 createOpenDelegate() {
        return new z65() { // from class: androidx.work.impl.WorkDatabase_Impl$createOpenDelegate$_openDelegate$1
            {
                super(24, "08b926448d86528e697981ddd30459f7", "149fd8ad55885d3fe3549a37a0163243");
            }

            @Override // defpackage.z65
            public void createAllTables(g85 g85Var) {
                g85Var.getClass();
                zz.y("CREATE TABLE IF NOT EXISTS `Dependency` (`work_spec_id` TEXT NOT NULL, `prerequisite_id` TEXT NOT NULL, PRIMARY KEY(`work_spec_id`, `prerequisite_id`), FOREIGN KEY(`work_spec_id`) REFERENCES `WorkSpec`(`id`) ON UPDATE CASCADE ON DELETE CASCADE , FOREIGN KEY(`prerequisite_id`) REFERENCES `WorkSpec`(`id`) ON UPDATE CASCADE ON DELETE CASCADE )", g85Var);
                zz.y("CREATE INDEX IF NOT EXISTS `index_Dependency_work_spec_id` ON `Dependency` (`work_spec_id`)", g85Var);
                zz.y("CREATE INDEX IF NOT EXISTS `index_Dependency_prerequisite_id` ON `Dependency` (`prerequisite_id`)", g85Var);
                zz.y("CREATE TABLE IF NOT EXISTS `WorkSpec` (`id` TEXT NOT NULL, `state` INTEGER NOT NULL, `worker_class_name` TEXT NOT NULL, `input_merger_class_name` TEXT NOT NULL, `input` BLOB NOT NULL, `output` BLOB NOT NULL, `initial_delay` INTEGER NOT NULL, `interval_duration` INTEGER NOT NULL, `flex_duration` INTEGER NOT NULL, `run_attempt_count` INTEGER NOT NULL, `backoff_policy` INTEGER NOT NULL, `backoff_delay_duration` INTEGER NOT NULL, `last_enqueue_time` INTEGER NOT NULL DEFAULT -1, `minimum_retention_duration` INTEGER NOT NULL, `schedule_requested_at` INTEGER NOT NULL, `run_in_foreground` INTEGER NOT NULL, `out_of_quota_policy` INTEGER NOT NULL, `period_count` INTEGER NOT NULL DEFAULT 0, `generation` INTEGER NOT NULL DEFAULT 0, `next_schedule_time_override` INTEGER NOT NULL DEFAULT 9223372036854775807, `next_schedule_time_override_generation` INTEGER NOT NULL DEFAULT 0, `stop_reason` INTEGER NOT NULL DEFAULT -256, `trace_tag` TEXT, `backoff_on_system_interruptions` INTEGER, `required_network_type` INTEGER NOT NULL, `required_network_request` BLOB NOT NULL DEFAULT x'', `requires_charging` INTEGER NOT NULL, `requires_device_idle` INTEGER NOT NULL, `requires_battery_not_low` INTEGER NOT NULL, `requires_storage_not_low` INTEGER NOT NULL, `trigger_content_update_delay` INTEGER NOT NULL, `trigger_max_content_delay` INTEGER NOT NULL, `content_uri_triggers` BLOB NOT NULL, PRIMARY KEY(`id`))", g85Var);
                zz.y("CREATE INDEX IF NOT EXISTS `index_WorkSpec_schedule_requested_at` ON `WorkSpec` (`schedule_requested_at`)", g85Var);
                zz.y("CREATE INDEX IF NOT EXISTS `index_WorkSpec_last_enqueue_time` ON `WorkSpec` (`last_enqueue_time`)", g85Var);
                zz.y("CREATE TABLE IF NOT EXISTS `WorkTag` (`tag` TEXT NOT NULL, `work_spec_id` TEXT NOT NULL, PRIMARY KEY(`tag`, `work_spec_id`), FOREIGN KEY(`work_spec_id`) REFERENCES `WorkSpec`(`id`) ON UPDATE CASCADE ON DELETE CASCADE )", g85Var);
                zz.y("CREATE INDEX IF NOT EXISTS `index_WorkTag_work_spec_id` ON `WorkTag` (`work_spec_id`)", g85Var);
                zz.y("CREATE TABLE IF NOT EXISTS `SystemIdInfo` (`work_spec_id` TEXT NOT NULL, `generation` INTEGER NOT NULL DEFAULT 0, `system_id` INTEGER NOT NULL, PRIMARY KEY(`work_spec_id`, `generation`), FOREIGN KEY(`work_spec_id`) REFERENCES `WorkSpec`(`id`) ON UPDATE CASCADE ON DELETE CASCADE )", g85Var);
                zz.y("CREATE TABLE IF NOT EXISTS `WorkName` (`name` TEXT NOT NULL, `work_spec_id` TEXT NOT NULL, PRIMARY KEY(`name`, `work_spec_id`), FOREIGN KEY(`work_spec_id`) REFERENCES `WorkSpec`(`id`) ON UPDATE CASCADE ON DELETE CASCADE )", g85Var);
                zz.y("CREATE INDEX IF NOT EXISTS `index_WorkName_work_spec_id` ON `WorkName` (`work_spec_id`)", g85Var);
                zz.y("CREATE TABLE IF NOT EXISTS `WorkProgress` (`work_spec_id` TEXT NOT NULL, `progress` BLOB NOT NULL, PRIMARY KEY(`work_spec_id`), FOREIGN KEY(`work_spec_id`) REFERENCES `WorkSpec`(`id`) ON UPDATE CASCADE ON DELETE CASCADE )", g85Var);
                zz.y("CREATE TABLE IF NOT EXISTS `Preference` (`key` TEXT NOT NULL, `long_value` INTEGER, PRIMARY KEY(`key`))", g85Var);
                zz.y("CREATE TABLE IF NOT EXISTS room_master_table (id INTEGER PRIMARY KEY,identity_hash TEXT)", g85Var);
                zz.y("INSERT OR REPLACE INTO room_master_table (id,identity_hash) VALUES(42, '08b926448d86528e697981ddd30459f7')", g85Var);
            }

            @Override // defpackage.z65
            public void dropAllTables(g85 g85Var) {
                g85Var.getClass();
                zz.y("DROP TABLE IF EXISTS `Dependency`", g85Var);
                zz.y("DROP TABLE IF EXISTS `WorkSpec`", g85Var);
                zz.y("DROP TABLE IF EXISTS `WorkTag`", g85Var);
                zz.y("DROP TABLE IF EXISTS `SystemIdInfo`", g85Var);
                zz.y("DROP TABLE IF EXISTS `WorkName`", g85Var);
                zz.y("DROP TABLE IF EXISTS `WorkProgress`", g85Var);
                zz.y("DROP TABLE IF EXISTS `Preference`", g85Var);
            }

            @Override // defpackage.z65
            public void onCreate(g85 g85Var) {
                g85Var.getClass();
            }

            @Override // defpackage.z65
            public void onOpen(g85 g85Var) {
                g85Var.getClass();
                zz.y("PRAGMA foreign_keys = ON", g85Var);
                WorkDatabase_Impl.this.internalInitInvalidationTracker(g85Var);
            }

            @Override // defpackage.z65
            public void onPostMigrate(g85 g85Var) {
                g85Var.getClass();
            }

            @Override // defpackage.z65
            public void onPreMigrate(g85 g85Var) {
                g85Var.getClass();
                n03.n(g85Var);
            }

            @Override // defpackage.z65
            public y65 onValidateSchema(g85 g85Var) {
                g85Var.getClass();
                LinkedHashMap linkedHashMap = new LinkedHashMap();
                linkedHashMap.put("work_spec_id", new s66(1, 1, "work_spec_id", "TEXT", null, true));
                linkedHashMap.put("prerequisite_id", new s66(2, 1, "prerequisite_id", "TEXT", null, true));
                LinkedHashSet linkedHashSet = new LinkedHashSet();
                linkedHashSet.add(new t66("WorkSpec", "CASCADE", "CASCADE", te4.H("work_spec_id"), te4.H("id")));
                linkedHashSet.add(new t66("WorkSpec", "CASCADE", "CASCADE", te4.H("prerequisite_id"), te4.H("id")));
                LinkedHashSet linkedHashSet2 = new LinkedHashSet();
                linkedHashSet2.add(new u66("index_Dependency_work_spec_id", false, te4.H("work_spec_id"), te4.H("ASC")));
                linkedHashSet2.add(new u66("index_Dependency_prerequisite_id", false, te4.H("prerequisite_id"), te4.H("ASC")));
                v66 v66Var = new v66("Dependency", linkedHashMap, linkedHashSet, linkedHashSet2);
                v66 g = fy5.g("Dependency", g85Var);
                if (!v66Var.equals(g)) {
                    return new y65("Dependency(androidx.work.impl.model.Dependency).\n Expected:\n" + v66Var + "\n Found:\n" + g, false);
                }
                LinkedHashMap linkedHashMap2 = new LinkedHashMap();
                linkedHashMap2.put("id", new s66(1, 1, "id", "TEXT", null, true));
                linkedHashMap2.put("state", new s66(0, 1, "state", "INTEGER", null, true));
                linkedHashMap2.put("worker_class_name", new s66(0, 1, "worker_class_name", "TEXT", null, true));
                linkedHashMap2.put("input_merger_class_name", new s66(0, 1, "input_merger_class_name", "TEXT", null, true));
                linkedHashMap2.put("input", new s66(0, 1, "input", "BLOB", null, true));
                linkedHashMap2.put("output", new s66(0, 1, "output", "BLOB", null, true));
                linkedHashMap2.put("initial_delay", new s66(0, 1, "initial_delay", "INTEGER", null, true));
                linkedHashMap2.put("interval_duration", new s66(0, 1, "interval_duration", "INTEGER", null, true));
                linkedHashMap2.put("flex_duration", new s66(0, 1, "flex_duration", "INTEGER", null, true));
                linkedHashMap2.put("run_attempt_count", new s66(0, 1, "run_attempt_count", "INTEGER", null, true));
                linkedHashMap2.put("backoff_policy", new s66(0, 1, "backoff_policy", "INTEGER", null, true));
                linkedHashMap2.put("backoff_delay_duration", new s66(0, 1, "backoff_delay_duration", "INTEGER", null, true));
                linkedHashMap2.put("last_enqueue_time", new s66(0, 1, "last_enqueue_time", "INTEGER", "-1", true));
                linkedHashMap2.put("minimum_retention_duration", new s66(0, 1, "minimum_retention_duration", "INTEGER", null, true));
                linkedHashMap2.put("schedule_requested_at", new s66(0, 1, "schedule_requested_at", "INTEGER", null, true));
                linkedHashMap2.put("run_in_foreground", new s66(0, 1, "run_in_foreground", "INTEGER", null, true));
                linkedHashMap2.put("out_of_quota_policy", new s66(0, 1, "out_of_quota_policy", "INTEGER", null, true));
                linkedHashMap2.put("period_count", new s66(0, 1, "period_count", "INTEGER", "0", true));
                linkedHashMap2.put("generation", new s66(0, 1, "generation", "INTEGER", "0", true));
                linkedHashMap2.put("next_schedule_time_override", new s66(0, 1, "next_schedule_time_override", "INTEGER", "9223372036854775807", true));
                linkedHashMap2.put("next_schedule_time_override_generation", new s66(0, 1, "next_schedule_time_override_generation", "INTEGER", "0", true));
                linkedHashMap2.put("stop_reason", new s66(0, 1, "stop_reason", "INTEGER", "-256", true));
                linkedHashMap2.put("trace_tag", new s66(0, 1, "trace_tag", "TEXT", null, false));
                linkedHashMap2.put("backoff_on_system_interruptions", new s66(0, 1, "backoff_on_system_interruptions", "INTEGER", null, false));
                linkedHashMap2.put("required_network_type", new s66(0, 1, "required_network_type", "INTEGER", null, true));
                linkedHashMap2.put("required_network_request", new s66(0, 1, "required_network_request", "BLOB", "x''", true));
                linkedHashMap2.put("requires_charging", new s66(0, 1, "requires_charging", "INTEGER", null, true));
                linkedHashMap2.put("requires_device_idle", new s66(0, 1, "requires_device_idle", "INTEGER", null, true));
                linkedHashMap2.put("requires_battery_not_low", new s66(0, 1, "requires_battery_not_low", "INTEGER", null, true));
                linkedHashMap2.put("requires_storage_not_low", new s66(0, 1, "requires_storage_not_low", "INTEGER", null, true));
                linkedHashMap2.put("trigger_content_update_delay", new s66(0, 1, "trigger_content_update_delay", "INTEGER", null, true));
                linkedHashMap2.put("trigger_max_content_delay", new s66(0, 1, "trigger_max_content_delay", "INTEGER", null, true));
                linkedHashMap2.put("content_uri_triggers", new s66(0, 1, "content_uri_triggers", "BLOB", null, true));
                LinkedHashSet linkedHashSet3 = new LinkedHashSet();
                LinkedHashSet linkedHashSet4 = new LinkedHashSet();
                linkedHashSet4.add(new u66("index_WorkSpec_schedule_requested_at", false, te4.H("schedule_requested_at"), te4.H("ASC")));
                linkedHashSet4.add(new u66("index_WorkSpec_last_enqueue_time", false, te4.H("last_enqueue_time"), te4.H("ASC")));
                v66 v66Var2 = new v66("WorkSpec", linkedHashMap2, linkedHashSet3, linkedHashSet4);
                v66 g2 = fy5.g("WorkSpec", g85Var);
                if (!v66Var2.equals(g2)) {
                    return new y65("WorkSpec(androidx.work.impl.model.WorkSpec).\n Expected:\n" + v66Var2 + "\n Found:\n" + g2, false);
                }
                LinkedHashMap linkedHashMap3 = new LinkedHashMap();
                linkedHashMap3.put("tag", new s66(1, 1, "tag", "TEXT", null, true));
                linkedHashMap3.put("work_spec_id", new s66(2, 1, "work_spec_id", "TEXT", null, true));
                LinkedHashSet linkedHashSet5 = new LinkedHashSet();
                linkedHashSet5.add(new t66("WorkSpec", "CASCADE", "CASCADE", te4.H("work_spec_id"), te4.H("id")));
                LinkedHashSet linkedHashSet6 = new LinkedHashSet();
                linkedHashSet6.add(new u66("index_WorkTag_work_spec_id", false, te4.H("work_spec_id"), te4.H("ASC")));
                v66 v66Var3 = new v66("WorkTag", linkedHashMap3, linkedHashSet5, linkedHashSet6);
                v66 g3 = fy5.g("WorkTag", g85Var);
                if (!v66Var3.equals(g3)) {
                    return new y65("WorkTag(androidx.work.impl.model.WorkTag).\n Expected:\n" + v66Var3 + "\n Found:\n" + g3, false);
                }
                LinkedHashMap linkedHashMap4 = new LinkedHashMap();
                linkedHashMap4.put("work_spec_id", new s66(1, 1, "work_spec_id", "TEXT", null, true));
                linkedHashMap4.put("generation", new s66(2, 1, "generation", "INTEGER", "0", true));
                linkedHashMap4.put("system_id", new s66(0, 1, "system_id", "INTEGER", null, true));
                LinkedHashSet linkedHashSet7 = new LinkedHashSet();
                linkedHashSet7.add(new t66("WorkSpec", "CASCADE", "CASCADE", te4.H("work_spec_id"), te4.H("id")));
                v66 v66Var4 = new v66("SystemIdInfo", linkedHashMap4, linkedHashSet7, new LinkedHashSet());
                v66 g4 = fy5.g("SystemIdInfo", g85Var);
                if (!v66Var4.equals(g4)) {
                    return new y65("SystemIdInfo(androidx.work.impl.model.SystemIdInfo).\n Expected:\n" + v66Var4 + "\n Found:\n" + g4, false);
                }
                LinkedHashMap linkedHashMap5 = new LinkedHashMap();
                linkedHashMap5.put(MediationMetaData.KEY_NAME, new s66(1, 1, MediationMetaData.KEY_NAME, "TEXT", null, true));
                linkedHashMap5.put("work_spec_id", new s66(2, 1, "work_spec_id", "TEXT", null, true));
                LinkedHashSet linkedHashSet8 = new LinkedHashSet();
                linkedHashSet8.add(new t66("WorkSpec", "CASCADE", "CASCADE", te4.H("work_spec_id"), te4.H("id")));
                LinkedHashSet linkedHashSet9 = new LinkedHashSet();
                linkedHashSet9.add(new u66("index_WorkName_work_spec_id", false, te4.H("work_spec_id"), te4.H("ASC")));
                v66 v66Var5 = new v66("WorkName", linkedHashMap5, linkedHashSet8, linkedHashSet9);
                v66 g5 = fy5.g("WorkName", g85Var);
                if (!v66Var5.equals(g5)) {
                    return new y65("WorkName(androidx.work.impl.model.WorkName).\n Expected:\n" + v66Var5 + "\n Found:\n" + g5, false);
                }
                LinkedHashMap linkedHashMap6 = new LinkedHashMap();
                linkedHashMap6.put("work_spec_id", new s66(1, 1, "work_spec_id", "TEXT", null, true));
                linkedHashMap6.put("progress", new s66(0, 1, "progress", "BLOB", null, true));
                LinkedHashSet linkedHashSet10 = new LinkedHashSet();
                linkedHashSet10.add(new t66("WorkSpec", "CASCADE", "CASCADE", te4.H("work_spec_id"), te4.H("id")));
                v66 v66Var6 = new v66("WorkProgress", linkedHashMap6, linkedHashSet10, new LinkedHashSet());
                v66 g6 = fy5.g("WorkProgress", g85Var);
                if (!v66Var6.equals(g6)) {
                    return new y65("WorkProgress(androidx.work.impl.model.WorkProgress).\n Expected:\n" + v66Var6 + "\n Found:\n" + g6, false);
                }
                LinkedHashMap linkedHashMap7 = new LinkedHashMap();
                linkedHashMap7.put("key", new s66(1, 1, "key", "TEXT", null, true));
                linkedHashMap7.put("long_value", new s66(0, 1, "long_value", "INTEGER", null, false));
                v66 v66Var7 = new v66("Preference", linkedHashMap7, new LinkedHashSet(), new LinkedHashSet());
                v66 g7 = fy5.g("Preference", g85Var);
                if (!v66Var7.equals(g7)) {
                    return new y65("Preference(androidx.work.impl.model.Preference).\n Expected:\n" + v66Var7 + "\n Found:\n" + g7, false);
                }
                return new y65(null, true);
            }
        };
    }

    @Override // androidx.work.impl.WorkDatabase
    public ce1 dependencyDao() {
        return (ce1) this._dependencyDao.getValue();
    }

    @Override // defpackage.v65
    public Set<e73> getRequiredAutoMigrationSpecClasses() {
        return new LinkedHashSet();
    }

    @Override // defpackage.v65
    public Map<e73, List<e73>> getRequiredTypeConverterClasses() {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        linkedHashMap.put(z05.a(a87.class), WorkSpecDao_Impl.Companion.getRequiredConverters());
        linkedHashMap.put(z05.a(ce1.class), DependencyDao_Impl.Companion.getRequiredConverters());
        linkedHashMap.put(z05.a(h87.class), WorkTagDao_Impl.Companion.getRequiredConverters());
        linkedHashMap.put(z05.a(m46.class), SystemIdInfoDao_Impl.Companion.getRequiredConverters());
        linkedHashMap.put(z05.a(q77.class), WorkNameDao_Impl.Companion.getRequiredConverters());
        linkedHashMap.put(z05.a(t77.class), WorkProgressDao_Impl.Companion.getRequiredConverters());
        linkedHashMap.put(z05.a(os4.class), PreferenceDao_Impl.Companion.getRequiredConverters());
        linkedHashMap.put(z05.a(ly4.class), RawWorkInfoDao_Impl.Companion.getRequiredConverters());
        return linkedHashMap;
    }

    @Override // androidx.work.impl.WorkDatabase
    public os4 preferenceDao() {
        return (os4) this._preferenceDao.getValue();
    }

    public ly4 rawWorkInfoDao() {
        return (ly4) this._rawWorkInfoDao.getValue();
    }

    @Override // androidx.work.impl.WorkDatabase
    public m46 systemIdInfoDao() {
        return (m46) this._systemIdInfoDao.getValue();
    }

    @Override // androidx.work.impl.WorkDatabase
    public q77 workNameDao() {
        return (q77) this._workNameDao.getValue();
    }

    @Override // androidx.work.impl.WorkDatabase
    public t77 workProgressDao() {
        return (t77) this._workProgressDao.getValue();
    }

    @Override // androidx.work.impl.WorkDatabase
    public a87 workSpecDao() {
        return (a87) this._workSpecDao.getValue();
    }

    @Override // androidx.work.impl.WorkDatabase
    public h87 workTagDao() {
        return (h87) this._workTagDao.getValue();
    }
}
