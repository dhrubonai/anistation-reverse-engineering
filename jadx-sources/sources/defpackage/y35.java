package defpackage;

import android.content.Context;
import android.content.SharedPreferences;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public final class y35 extends oy3 {
    public final /* synthetic */ byte a = 1;
    public final Context b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public y35(Context context) {
        super(9, 10);
        context.getClass();
        this.b = context;
    }

    @Override // defpackage.oy3
    public final void migrate(x26 x26Var) {
        byte b = this.a;
        Context context = this.b;
        x26Var.getClass();
        switch (b) {
            case 0:
                if (this.endVersion >= 10) {
                    x26Var.O(new Object[]{"reschedule_needed", 1});
                    return;
                } else {
                    context.getSharedPreferences("androidx.work.util.preferences", 0).edit().putBoolean("reschedule_needed", true).apply();
                    return;
                }
            default:
                x26Var.v("CREATE TABLE IF NOT EXISTS `Preference` (`key` TEXT NOT NULL, `long_value` INTEGER, PRIMARY KEY(`key`))");
                SharedPreferences sharedPreferences = context.getSharedPreferences("androidx.work.util.preferences", 0);
                if (sharedPreferences.contains("reschedule_needed") || sharedPreferences.contains("last_cancel_all_time_ms")) {
                    long j = 0;
                    long j2 = sharedPreferences.getLong("last_cancel_all_time_ms", 0L);
                    if (sharedPreferences.getBoolean("reschedule_needed", false)) {
                        j = 1;
                    }
                    x26Var.n();
                    try {
                        x26Var.O(new Object[]{"last_cancel_all_time_ms", Long.valueOf(j2)});
                        x26Var.O(new Object[]{"reschedule_needed", Long.valueOf(j)});
                        sharedPreferences.edit().clear().apply();
                        x26Var.P();
                    } finally {
                    }
                }
                SharedPreferences sharedPreferences2 = context.getSharedPreferences("androidx.work.util.id", 0);
                if (sharedPreferences2.contains("next_job_scheduler_id") || sharedPreferences2.contains("next_job_scheduler_id")) {
                    int i = sharedPreferences2.getInt("next_job_scheduler_id", 0);
                    int i2 = sharedPreferences2.getInt("next_alarm_manager_id", 0);
                    x26Var.n();
                    try {
                        x26Var.O(new Object[]{"next_job_scheduler_id", Integer.valueOf(i)});
                        x26Var.O(new Object[]{"next_alarm_manager_id", Integer.valueOf(i2)});
                        sharedPreferences2.edit().clear().apply();
                        x26Var.P();
                        return;
                    } finally {
                    }
                }
                return;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public y35(Context context, int i, int i2) {
        super(i, i2);
        context.getClass();
        this.b = context;
    }
}
