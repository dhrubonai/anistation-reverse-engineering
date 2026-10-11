package defpackage;

import androidx.work.impl.model.WorkSpecDao_Impl;
import java.util.List;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public final /* synthetic */ class c87 implements ub2 {
    public final /* synthetic */ byte x;
    public final /* synthetic */ String y;
    public final /* synthetic */ WorkSpecDao_Impl z;

    public /* synthetic */ c87(String str, WorkSpecDao_Impl workSpecDao_Impl, byte b) {
        this.x = b;
        this.y = str;
        this.z = workSpecDao_Impl;
    }

    @Override // defpackage.ub2
    public final Object invoke(Object obj) {
        List workStatusPojoFlowForTag$lambda$0;
        List workStatusPojoForTag$lambda$0;
        List workStatusPojoLiveDataForName$lambda$0;
        List workStatusPojoForName$lambda$0;
        List workStatusPojoFlowForName$lambda$0;
        y77 workStatusPojoForId$lambda$0;
        List workStatusPojoLiveDataForTag$lambda$0;
        byte b = this.x;
        WorkSpecDao_Impl workSpecDao_Impl = this.z;
        String str = this.y;
        g85 g85Var = (g85) obj;
        switch (b) {
            case 0:
                workStatusPojoFlowForTag$lambda$0 = WorkSpecDao_Impl.getWorkStatusPojoFlowForTag$lambda$0("SELECT id, state, output, run_attempt_count, generation, required_network_type, required_network_request, requires_charging, requires_device_idle, requires_battery_not_low, requires_storage_not_low, trigger_content_update_delay, trigger_max_content_delay, content_uri_triggers, initial_delay, interval_duration, flex_duration, backoff_policy, backoff_delay_duration, last_enqueue_time, period_count, next_schedule_time_override, stop_reason, worker_class_name FROM workspec WHERE id IN\n            (SELECT work_spec_id FROM worktag WHERE tag=?)", str, workSpecDao_Impl, g85Var);
                return workStatusPojoFlowForTag$lambda$0;
            case 1:
                workStatusPojoForTag$lambda$0 = WorkSpecDao_Impl.getWorkStatusPojoForTag$lambda$0("SELECT id, state, output, run_attempt_count, generation, required_network_type, required_network_request, requires_charging, requires_device_idle, requires_battery_not_low, requires_storage_not_low, trigger_content_update_delay, trigger_max_content_delay, content_uri_triggers, initial_delay, interval_duration, flex_duration, backoff_policy, backoff_delay_duration, last_enqueue_time, period_count, next_schedule_time_override, stop_reason, worker_class_name FROM workspec WHERE id IN\n            (SELECT work_spec_id FROM worktag WHERE tag=?)", str, workSpecDao_Impl, g85Var);
                return workStatusPojoForTag$lambda$0;
            case 2:
                workStatusPojoLiveDataForName$lambda$0 = WorkSpecDao_Impl.getWorkStatusPojoLiveDataForName$lambda$0("SELECT id, state, output, run_attempt_count, generation, required_network_type, required_network_request, requires_charging, requires_device_idle, requires_battery_not_low, requires_storage_not_low, trigger_content_update_delay, trigger_max_content_delay, content_uri_triggers, initial_delay, interval_duration, flex_duration, backoff_policy, backoff_delay_duration, last_enqueue_time, period_count, next_schedule_time_override, stop_reason, worker_class_name FROM workspec WHERE id IN (SELECT work_spec_id FROM workname WHERE name=?)", str, workSpecDao_Impl, g85Var);
                return workStatusPojoLiveDataForName$lambda$0;
            case 3:
                workStatusPojoForName$lambda$0 = WorkSpecDao_Impl.getWorkStatusPojoForName$lambda$0("SELECT id, state, output, run_attempt_count, generation, required_network_type, required_network_request, requires_charging, requires_device_idle, requires_battery_not_low, requires_storage_not_low, trigger_content_update_delay, trigger_max_content_delay, content_uri_triggers, initial_delay, interval_duration, flex_duration, backoff_policy, backoff_delay_duration, last_enqueue_time, period_count, next_schedule_time_override, stop_reason, worker_class_name FROM workspec WHERE id IN (SELECT work_spec_id FROM workname WHERE name=?)", str, workSpecDao_Impl, g85Var);
                return workStatusPojoForName$lambda$0;
            case 4:
                workStatusPojoFlowForName$lambda$0 = WorkSpecDao_Impl.getWorkStatusPojoFlowForName$lambda$0("SELECT id, state, output, run_attempt_count, generation, required_network_type, required_network_request, requires_charging, requires_device_idle, requires_battery_not_low, requires_storage_not_low, trigger_content_update_delay, trigger_max_content_delay, content_uri_triggers, initial_delay, interval_duration, flex_duration, backoff_policy, backoff_delay_duration, last_enqueue_time, period_count, next_schedule_time_override, stop_reason, worker_class_name FROM workspec WHERE id IN (SELECT work_spec_id FROM workname WHERE name=?)", str, workSpecDao_Impl, g85Var);
                return workStatusPojoFlowForName$lambda$0;
            case 5:
                workStatusPojoForId$lambda$0 = WorkSpecDao_Impl.getWorkStatusPojoForId$lambda$0("SELECT id, state, output, run_attempt_count, generation, required_network_type, required_network_request, requires_charging, requires_device_idle, requires_battery_not_low, requires_storage_not_low, trigger_content_update_delay, trigger_max_content_delay, content_uri_triggers, initial_delay, interval_duration, flex_duration, backoff_policy, backoff_delay_duration, last_enqueue_time, period_count, next_schedule_time_override, stop_reason, worker_class_name FROM workspec WHERE id=?", str, workSpecDao_Impl, g85Var);
                return workStatusPojoForId$lambda$0;
            default:
                workStatusPojoLiveDataForTag$lambda$0 = WorkSpecDao_Impl.getWorkStatusPojoLiveDataForTag$lambda$0("SELECT id, state, output, run_attempt_count, generation, required_network_type, required_network_request, requires_charging, requires_device_idle, requires_battery_not_low, requires_storage_not_low, trigger_content_update_delay, trigger_max_content_delay, content_uri_triggers, initial_delay, interval_duration, flex_duration, backoff_policy, backoff_delay_duration, last_enqueue_time, period_count, next_schedule_time_override, stop_reason, worker_class_name FROM workspec WHERE id IN\n            (SELECT work_spec_id FROM worktag WHERE tag=?)", str, workSpecDao_Impl, g85Var);
                return workStatusPojoLiveDataForTag$lambda$0;
        }
    }
}
