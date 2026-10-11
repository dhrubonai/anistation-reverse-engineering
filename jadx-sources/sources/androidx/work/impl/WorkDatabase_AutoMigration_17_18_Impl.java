package androidx.work.impl;

import defpackage.g85;
import defpackage.oy3;
import defpackage.zz;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public final class WorkDatabase_AutoMigration_17_18_Impl extends oy3 {
    public WorkDatabase_AutoMigration_17_18_Impl() {
        super(17, 18);
    }

    @Override // defpackage.oy3
    public void migrate(g85 g85Var) {
        g85Var.getClass();
        zz.y("ALTER TABLE `WorkSpec` ADD COLUMN `next_schedule_time_override` INTEGER NOT NULL DEFAULT 9223372036854775807", g85Var);
        zz.y("ALTER TABLE `WorkSpec` ADD COLUMN `next_schedule_time_override_generation` INTEGER NOT NULL DEFAULT 0", g85Var);
    }
}
