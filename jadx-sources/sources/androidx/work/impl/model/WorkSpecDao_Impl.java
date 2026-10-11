package androidx.work.impl.model;

import defpackage.a34;
import defpackage.a87;
import defpackage.b87;
import defpackage.c00;
import defpackage.c87;
import defpackage.cj3;
import defpackage.d87;
import defpackage.da;
import defpackage.dr6;
import defpackage.e41;
import defpackage.e73;
import defpackage.e87;
import defpackage.f87;
import defpackage.f94;
import defpackage.fs;
import defpackage.g85;
import defpackage.gs;
import defpackage.gy5;
import defpackage.j77;
import defpackage.js;
import defpackage.jv1;
import defpackage.k94;
import defpackage.kv1;
import defpackage.ll5;
import defpackage.m85;
import defpackage.nt1;
import defpackage.nz5;
import defpackage.o80;
import defpackage.pb;
import defpackage.pn6;
import defpackage.q23;
import defpackage.q71;
import defpackage.qx0;
import defpackage.r77;
import defpackage.so5;
import defpackage.t80;
import defpackage.v65;
import defpackage.vn3;
import defpackage.w42;
import defpackage.wg4;
import defpackage.wm;
import defpackage.x77;
import defpackage.y77;
import defpackage.z77;
import defpackage.ze0;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public final class WorkSpecDao_Impl implements a87 {
    public static final Companion Companion = new Companion(null);
    private final v65 __db;
    private final kv1 __insertAdapterOfWorkSpec;
    private final jv1 __updateAdapterOfWorkSpec;

    /* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
    /* renamed from: androidx.work.impl.model.WorkSpecDao_Impl$1 */
    /* loaded from: classes.dex */
    public static final class AnonymousClass1 extends kv1 {
        @Override // defpackage.kv1
        public void bind(m85 m85Var, z77 z77Var) {
            int i;
            Integer num;
            m85Var.getClass();
            z77Var.getClass();
            int i2 = 1;
            m85Var.J(1, z77Var.a);
            m85Var.e(2, gy5.q(z77Var.b));
            m85Var.J(3, z77Var.c);
            m85Var.J(4, z77Var.d);
            e41 e41Var = e41.b;
            m85Var.f(5, a34.t0(z77Var.e));
            m85Var.f(6, a34.t0(z77Var.f));
            m85Var.e(7, z77Var.g);
            m85Var.e(8, z77Var.h);
            m85Var.e(9, z77Var.i);
            m85Var.e(10, z77Var.k);
            c00 c00Var = z77Var.l;
            c00Var.getClass();
            int ordinal = c00Var.ordinal();
            if (ordinal != 0) {
                if (ordinal == 1) {
                    i = 1;
                } else {
                    ze0.l();
                    return;
                }
            } else {
                i = 0;
            }
            m85Var.e(11, i);
            m85Var.e(12, z77Var.m);
            m85Var.e(13, z77Var.n);
            m85Var.e(14, z77Var.o);
            m85Var.e(15, z77Var.p);
            m85Var.e(16, z77Var.q ? 1L : 0L);
            wg4 wg4Var = z77Var.r;
            wg4Var.getClass();
            int ordinal2 = wg4Var.ordinal();
            if (ordinal2 != 0) {
                if (ordinal2 != 1) {
                    ze0.l();
                    return;
                }
            } else {
                i2 = 0;
            }
            m85Var.e(17, i2);
            m85Var.e(18, z77Var.s);
            m85Var.e(19, z77Var.t);
            m85Var.e(20, z77Var.u);
            m85Var.e(21, z77Var.v);
            m85Var.e(22, z77Var.w);
            String str = z77Var.x;
            if (str == null) {
                m85Var.h(23);
            } else {
                m85Var.J(23, str);
            }
            Boolean bool = z77Var.y;
            if (bool != null) {
                num = Integer.valueOf(bool.booleanValue() ? 1 : 0);
            } else {
                num = null;
            }
            if (num == null) {
                m85Var.h(24);
            } else {
                m85Var.e(24, num.intValue());
            }
            qx0 qx0Var = z77Var.j;
            m85Var.e(25, gy5.o(qx0Var.a));
            m85Var.f(26, gy5.f(qx0Var.b));
            m85Var.e(27, qx0Var.c ? 1L : 0L);
            m85Var.e(28, qx0Var.d ? 1L : 0L);
            m85Var.e(29, qx0Var.e ? 1L : 0L);
            m85Var.e(30, qx0Var.f ? 1L : 0L);
            m85Var.e(31, qx0Var.g);
            m85Var.e(32, qx0Var.h);
            m85Var.f(33, gy5.p(qx0Var.i));
        }

        @Override // defpackage.kv1
        public String createQuery() {
            return "INSERT OR IGNORE INTO `WorkSpec` (`id`,`state`,`worker_class_name`,`input_merger_class_name`,`input`,`output`,`initial_delay`,`interval_duration`,`flex_duration`,`run_attempt_count`,`backoff_policy`,`backoff_delay_duration`,`last_enqueue_time`,`minimum_retention_duration`,`schedule_requested_at`,`run_in_foreground`,`out_of_quota_policy`,`period_count`,`generation`,`next_schedule_time_override`,`next_schedule_time_override_generation`,`stop_reason`,`trace_tag`,`backoff_on_system_interruptions`,`required_network_type`,`required_network_request`,`requires_charging`,`requires_device_idle`,`requires_battery_not_low`,`requires_storage_not_low`,`trigger_content_update_delay`,`trigger_max_content_delay`,`content_uri_triggers`) VALUES (?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)";
        }
    }

    /* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
    /* renamed from: androidx.work.impl.model.WorkSpecDao_Impl$2 */
    /* loaded from: classes.dex */
    public static final class AnonymousClass2 extends jv1 {
        @Override // defpackage.jv1
        public void bind(m85 m85Var, z77 z77Var) {
            int i;
            Integer num;
            m85Var.getClass();
            z77Var.getClass();
            String str = z77Var.a;
            int i2 = 1;
            m85Var.J(1, str);
            m85Var.e(2, gy5.q(z77Var.b));
            m85Var.J(3, z77Var.c);
            m85Var.J(4, z77Var.d);
            e41 e41Var = e41.b;
            m85Var.f(5, a34.t0(z77Var.e));
            m85Var.f(6, a34.t0(z77Var.f));
            m85Var.e(7, z77Var.g);
            m85Var.e(8, z77Var.h);
            m85Var.e(9, z77Var.i);
            m85Var.e(10, z77Var.k);
            c00 c00Var = z77Var.l;
            c00Var.getClass();
            int ordinal = c00Var.ordinal();
            if (ordinal != 0) {
                if (ordinal == 1) {
                    i = 1;
                } else {
                    ze0.l();
                    return;
                }
            } else {
                i = 0;
            }
            m85Var.e(11, i);
            m85Var.e(12, z77Var.m);
            m85Var.e(13, z77Var.n);
            m85Var.e(14, z77Var.o);
            m85Var.e(15, z77Var.p);
            m85Var.e(16, z77Var.q ? 1L : 0L);
            wg4 wg4Var = z77Var.r;
            wg4Var.getClass();
            int ordinal2 = wg4Var.ordinal();
            if (ordinal2 != 0) {
                if (ordinal2 != 1) {
                    ze0.l();
                    return;
                }
            } else {
                i2 = 0;
            }
            m85Var.e(17, i2);
            m85Var.e(18, z77Var.s);
            m85Var.e(19, z77Var.t);
            m85Var.e(20, z77Var.u);
            m85Var.e(21, z77Var.v);
            m85Var.e(22, z77Var.w);
            String str2 = z77Var.x;
            if (str2 == null) {
                m85Var.h(23);
            } else {
                m85Var.J(23, str2);
            }
            Boolean bool = z77Var.y;
            if (bool != null) {
                num = Integer.valueOf(bool.booleanValue() ? 1 : 0);
            } else {
                num = null;
            }
            if (num == null) {
                m85Var.h(24);
            } else {
                m85Var.e(24, num.intValue());
            }
            qx0 qx0Var = z77Var.j;
            m85Var.e(25, gy5.o(qx0Var.a));
            m85Var.f(26, gy5.f(qx0Var.b));
            m85Var.e(27, qx0Var.c ? 1L : 0L);
            m85Var.e(28, qx0Var.d ? 1L : 0L);
            m85Var.e(29, qx0Var.e ? 1L : 0L);
            m85Var.e(30, qx0Var.f ? 1L : 0L);
            m85Var.e(31, qx0Var.g);
            m85Var.e(32, qx0Var.h);
            m85Var.f(33, gy5.p(qx0Var.i));
            m85Var.J(34, str);
        }

        @Override // defpackage.jv1
        public String createQuery() {
            return "UPDATE OR ABORT `WorkSpec` SET `id` = ?,`state` = ?,`worker_class_name` = ?,`input_merger_class_name` = ?,`input` = ?,`output` = ?,`initial_delay` = ?,`interval_duration` = ?,`flex_duration` = ?,`run_attempt_count` = ?,`backoff_policy` = ?,`backoff_delay_duration` = ?,`last_enqueue_time` = ?,`minimum_retention_duration` = ?,`schedule_requested_at` = ?,`run_in_foreground` = ?,`out_of_quota_policy` = ?,`period_count` = ?,`generation` = ?,`next_schedule_time_override` = ?,`next_schedule_time_override_generation` = ?,`stop_reason` = ?,`trace_tag` = ?,`backoff_on_system_interruptions` = ?,`required_network_type` = ?,`required_network_request` = ?,`requires_charging` = ?,`requires_device_idle` = ?,`requires_battery_not_low` = ?,`requires_storage_not_low` = ?,`trigger_content_update_delay` = ?,`trigger_max_content_delay` = ?,`content_uri_triggers` = ? WHERE `id` = ?";
        }
    }

    public WorkSpecDao_Impl(v65 v65Var) {
        v65Var.getClass();
        this.__db = v65Var;
        this.__insertAdapterOfWorkSpec = new kv1() { // from class: androidx.work.impl.model.WorkSpecDao_Impl.1
            @Override // defpackage.kv1
            public void bind(m85 m85Var, z77 z77Var) {
                int i;
                Integer num;
                m85Var.getClass();
                z77Var.getClass();
                int i2 = 1;
                m85Var.J(1, z77Var.a);
                m85Var.e(2, gy5.q(z77Var.b));
                m85Var.J(3, z77Var.c);
                m85Var.J(4, z77Var.d);
                e41 e41Var = e41.b;
                m85Var.f(5, a34.t0(z77Var.e));
                m85Var.f(6, a34.t0(z77Var.f));
                m85Var.e(7, z77Var.g);
                m85Var.e(8, z77Var.h);
                m85Var.e(9, z77Var.i);
                m85Var.e(10, z77Var.k);
                c00 c00Var = z77Var.l;
                c00Var.getClass();
                int ordinal = c00Var.ordinal();
                if (ordinal != 0) {
                    if (ordinal == 1) {
                        i = 1;
                    } else {
                        ze0.l();
                        return;
                    }
                } else {
                    i = 0;
                }
                m85Var.e(11, i);
                m85Var.e(12, z77Var.m);
                m85Var.e(13, z77Var.n);
                m85Var.e(14, z77Var.o);
                m85Var.e(15, z77Var.p);
                m85Var.e(16, z77Var.q ? 1L : 0L);
                wg4 wg4Var = z77Var.r;
                wg4Var.getClass();
                int ordinal2 = wg4Var.ordinal();
                if (ordinal2 != 0) {
                    if (ordinal2 != 1) {
                        ze0.l();
                        return;
                    }
                } else {
                    i2 = 0;
                }
                m85Var.e(17, i2);
                m85Var.e(18, z77Var.s);
                m85Var.e(19, z77Var.t);
                m85Var.e(20, z77Var.u);
                m85Var.e(21, z77Var.v);
                m85Var.e(22, z77Var.w);
                String str = z77Var.x;
                if (str == null) {
                    m85Var.h(23);
                } else {
                    m85Var.J(23, str);
                }
                Boolean bool = z77Var.y;
                if (bool != null) {
                    num = Integer.valueOf(bool.booleanValue() ? 1 : 0);
                } else {
                    num = null;
                }
                if (num == null) {
                    m85Var.h(24);
                } else {
                    m85Var.e(24, num.intValue());
                }
                qx0 qx0Var = z77Var.j;
                m85Var.e(25, gy5.o(qx0Var.a));
                m85Var.f(26, gy5.f(qx0Var.b));
                m85Var.e(27, qx0Var.c ? 1L : 0L);
                m85Var.e(28, qx0Var.d ? 1L : 0L);
                m85Var.e(29, qx0Var.e ? 1L : 0L);
                m85Var.e(30, qx0Var.f ? 1L : 0L);
                m85Var.e(31, qx0Var.g);
                m85Var.e(32, qx0Var.h);
                m85Var.f(33, gy5.p(qx0Var.i));
            }

            @Override // defpackage.kv1
            public String createQuery() {
                return "INSERT OR IGNORE INTO `WorkSpec` (`id`,`state`,`worker_class_name`,`input_merger_class_name`,`input`,`output`,`initial_delay`,`interval_duration`,`flex_duration`,`run_attempt_count`,`backoff_policy`,`backoff_delay_duration`,`last_enqueue_time`,`minimum_retention_duration`,`schedule_requested_at`,`run_in_foreground`,`out_of_quota_policy`,`period_count`,`generation`,`next_schedule_time_override`,`next_schedule_time_override_generation`,`stop_reason`,`trace_tag`,`backoff_on_system_interruptions`,`required_network_type`,`required_network_request`,`requires_charging`,`requires_device_idle`,`requires_battery_not_low`,`requires_storage_not_low`,`trigger_content_update_delay`,`trigger_max_content_delay`,`content_uri_triggers`) VALUES (?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)";
            }
        };
        this.__updateAdapterOfWorkSpec = new jv1() { // from class: androidx.work.impl.model.WorkSpecDao_Impl.2
            @Override // defpackage.jv1
            public void bind(m85 m85Var, z77 z77Var) {
                int i;
                Integer num;
                m85Var.getClass();
                z77Var.getClass();
                String str = z77Var.a;
                int i2 = 1;
                m85Var.J(1, str);
                m85Var.e(2, gy5.q(z77Var.b));
                m85Var.J(3, z77Var.c);
                m85Var.J(4, z77Var.d);
                e41 e41Var = e41.b;
                m85Var.f(5, a34.t0(z77Var.e));
                m85Var.f(6, a34.t0(z77Var.f));
                m85Var.e(7, z77Var.g);
                m85Var.e(8, z77Var.h);
                m85Var.e(9, z77Var.i);
                m85Var.e(10, z77Var.k);
                c00 c00Var = z77Var.l;
                c00Var.getClass();
                int ordinal = c00Var.ordinal();
                if (ordinal != 0) {
                    if (ordinal == 1) {
                        i = 1;
                    } else {
                        ze0.l();
                        return;
                    }
                } else {
                    i = 0;
                }
                m85Var.e(11, i);
                m85Var.e(12, z77Var.m);
                m85Var.e(13, z77Var.n);
                m85Var.e(14, z77Var.o);
                m85Var.e(15, z77Var.p);
                m85Var.e(16, z77Var.q ? 1L : 0L);
                wg4 wg4Var = z77Var.r;
                wg4Var.getClass();
                int ordinal2 = wg4Var.ordinal();
                if (ordinal2 != 0) {
                    if (ordinal2 != 1) {
                        ze0.l();
                        return;
                    }
                } else {
                    i2 = 0;
                }
                m85Var.e(17, i2);
                m85Var.e(18, z77Var.s);
                m85Var.e(19, z77Var.t);
                m85Var.e(20, z77Var.u);
                m85Var.e(21, z77Var.v);
                m85Var.e(22, z77Var.w);
                String str2 = z77Var.x;
                if (str2 == null) {
                    m85Var.h(23);
                } else {
                    m85Var.J(23, str2);
                }
                Boolean bool = z77Var.y;
                if (bool != null) {
                    num = Integer.valueOf(bool.booleanValue() ? 1 : 0);
                } else {
                    num = null;
                }
                if (num == null) {
                    m85Var.h(24);
                } else {
                    m85Var.e(24, num.intValue());
                }
                qx0 qx0Var = z77Var.j;
                m85Var.e(25, gy5.o(qx0Var.a));
                m85Var.f(26, gy5.f(qx0Var.b));
                m85Var.e(27, qx0Var.c ? 1L : 0L);
                m85Var.e(28, qx0Var.d ? 1L : 0L);
                m85Var.e(29, qx0Var.e ? 1L : 0L);
                m85Var.e(30, qx0Var.f ? 1L : 0L);
                m85Var.e(31, qx0Var.g);
                m85Var.e(32, qx0Var.h);
                m85Var.f(33, gy5.p(qx0Var.i));
                m85Var.J(34, str);
            }

            @Override // defpackage.jv1
            public String createQuery() {
                return "UPDATE OR ABORT `WorkSpec` SET `id` = ?,`state` = ?,`worker_class_name` = ?,`input_merger_class_name` = ?,`input` = ?,`output` = ?,`initial_delay` = ?,`interval_duration` = ?,`flex_duration` = ?,`run_attempt_count` = ?,`backoff_policy` = ?,`backoff_delay_duration` = ?,`last_enqueue_time` = ?,`minimum_retention_duration` = ?,`schedule_requested_at` = ?,`run_in_foreground` = ?,`out_of_quota_policy` = ?,`period_count` = ?,`generation` = ?,`next_schedule_time_override` = ?,`next_schedule_time_override_generation` = ?,`stop_reason` = ?,`trace_tag` = ?,`backoff_on_system_interruptions` = ?,`required_network_type` = ?,`required_network_request` = ?,`requires_charging` = ?,`requires_device_idle` = ?,`requires_battery_not_low` = ?,`requires_storage_not_low` = ?,`trigger_content_update_delay` = ?,`trigger_max_content_delay` = ?,`content_uri_triggers` = ? WHERE `id` = ?";
            }
        };
    }

    /* JADX WARN: Type inference failed for: r0v8, types: [so5, js] */
    private final void __fetchRelationshipWorkProgressAsandroidxWorkData(g85 g85Var, js jsVar) {
        gs gsVar = (gs) jsVar.keySet();
        js jsVar2 = gsVar.x;
        if (jsVar2.isEmpty()) {
            return;
        }
        if (jsVar.z > 999) {
            ?? so5Var = new so5(v65.MAX_BIND_PARAMETER_CNT);
            int i = jsVar.z;
            int i2 = 0;
            int i3 = 0;
            while (i2 < i) {
                so5Var.put(jsVar.e(i2), jsVar.h(i2));
                i2++;
                i3++;
                if (i3 == 999) {
                    __fetchRelationshipWorkProgressAsandroidxWorkData$lambda$0(this, g85Var, so5Var);
                    so5Var.clear();
                    i3 = 0;
                }
            }
            if (i3 > 0) {
                __fetchRelationshipWorkProgressAsandroidxWorkData$lambda$0(this, g85Var, so5Var);
                return;
            }
            return;
        }
        StringBuilder sb = new StringBuilder();
        sb.append("SELECT `progress`,`work_spec_id` FROM `WorkProgress` WHERE `work_spec_id` IN (");
        nz5.a(sb, jsVar2.z);
        sb.append(")");
        m85 s0 = g85Var.s0(sb.toString());
        Iterator it = gsVar.iterator();
        int i4 = 1;
        while (true) {
            fs fsVar = (fs) it;
            if (fsVar.hasNext()) {
                s0.J(i4, (String) fsVar.next());
                i4++;
            } else {
                try {
                    break;
                } finally {
                    s0.close();
                }
            }
        }
        int J = t80.J(s0, "work_spec_id");
        if (J == -1) {
            return;
        }
        while (s0.p0()) {
            List list = (List) jsVar.get(s0.c0(J));
            if (list != null) {
                byte[] blob = s0.getBlob(0);
                e41 e41Var = e41.b;
                list.add(a34.U(blob));
            }
        }
    }

    public static final pn6 __fetchRelationshipWorkProgressAsandroidxWorkData$lambda$0(WorkSpecDao_Impl workSpecDao_Impl, g85 g85Var, js jsVar) {
        jsVar.getClass();
        workSpecDao_Impl.__fetchRelationshipWorkProgressAsandroidxWorkData(g85Var, jsVar);
        return pn6.a;
    }

    /* JADX WARN: Type inference failed for: r0v8, types: [so5, js] */
    private final void __fetchRelationshipWorkTagAsjavaLangString(g85 g85Var, js jsVar) {
        gs gsVar = (gs) jsVar.keySet();
        js jsVar2 = gsVar.x;
        if (jsVar2.isEmpty()) {
            return;
        }
        if (jsVar.z > 999) {
            ?? so5Var = new so5(v65.MAX_BIND_PARAMETER_CNT);
            int i = jsVar.z;
            int i2 = 0;
            int i3 = 0;
            while (i2 < i) {
                so5Var.put(jsVar.e(i2), jsVar.h(i2));
                i2++;
                i3++;
                if (i3 == 999) {
                    __fetchRelationshipWorkTagAsjavaLangString$lambda$0(this, g85Var, so5Var);
                    so5Var.clear();
                    i3 = 0;
                }
            }
            if (i3 > 0) {
                __fetchRelationshipWorkTagAsjavaLangString$lambda$0(this, g85Var, so5Var);
                return;
            }
            return;
        }
        StringBuilder sb = new StringBuilder();
        sb.append("SELECT `tag`,`work_spec_id` FROM `WorkTag` WHERE `work_spec_id` IN (");
        nz5.a(sb, jsVar2.z);
        sb.append(")");
        m85 s0 = g85Var.s0(sb.toString());
        Iterator it = gsVar.iterator();
        int i4 = 1;
        while (true) {
            fs fsVar = (fs) it;
            if (fsVar.hasNext()) {
                s0.J(i4, (String) fsVar.next());
                i4++;
            } else {
                try {
                    break;
                } finally {
                    s0.close();
                }
            }
        }
        int J = t80.J(s0, "work_spec_id");
        if (J == -1) {
            return;
        }
        while (s0.p0()) {
            List list = (List) jsVar.get(s0.c0(J));
            if (list != null) {
                list.add(s0.c0(0));
            }
        }
    }

    public static final pn6 __fetchRelationshipWorkTagAsjavaLangString$lambda$0(WorkSpecDao_Impl workSpecDao_Impl, g85 g85Var, js jsVar) {
        jsVar.getClass();
        workSpecDao_Impl.__fetchRelationshipWorkTagAsjavaLangString(g85Var, jsVar);
        return pn6.a;
    }

    public static final int countNonFinishedContentUriTriggerWorkers$lambda$0(String str, g85 g85Var) {
        g85Var.getClass();
        m85 s0 = g85Var.s0(str);
        try {
            int i = 0;
            if (s0.p0()) {
                i = (int) s0.getLong(0);
            }
            return i;
        } finally {
            s0.close();
        }
    }

    public static final pn6 delete$lambda$0(String str, String str2, g85 g85Var) {
        g85Var.getClass();
        m85 s0 = g85Var.s0(str);
        try {
            s0.J(1, str2);
            s0.p0();
            s0.close();
            return pn6.a;
        } catch (Throwable th) {
            s0.close();
            throw th;
        }
    }

    public static final List getAllEligibleWorkSpecsForScheduling$lambda$0(String str, int i, g85 g85Var) {
        boolean z;
        String c0;
        int i2;
        Integer valueOf;
        boolean z2;
        boolean z3;
        boolean z4;
        boolean z5;
        boolean z6;
        g85Var.getClass();
        m85 s0 = g85Var.s0(str);
        try {
            s0.e(1, i);
            int K = t80.K(s0, "id");
            int K2 = t80.K(s0, "state");
            int K3 = t80.K(s0, "worker_class_name");
            int K4 = t80.K(s0, "input_merger_class_name");
            int K5 = t80.K(s0, "input");
            int K6 = t80.K(s0, "output");
            int K7 = t80.K(s0, "initial_delay");
            int K8 = t80.K(s0, "interval_duration");
            int K9 = t80.K(s0, "flex_duration");
            int K10 = t80.K(s0, "run_attempt_count");
            int K11 = t80.K(s0, "backoff_policy");
            int K12 = t80.K(s0, "backoff_delay_duration");
            int K13 = t80.K(s0, "last_enqueue_time");
            int K14 = t80.K(s0, "minimum_retention_duration");
            int K15 = t80.K(s0, "schedule_requested_at");
            int K16 = t80.K(s0, "run_in_foreground");
            int K17 = t80.K(s0, "out_of_quota_policy");
            int K18 = t80.K(s0, "period_count");
            int K19 = t80.K(s0, "generation");
            int K20 = t80.K(s0, "next_schedule_time_override");
            int K21 = t80.K(s0, "next_schedule_time_override_generation");
            int K22 = t80.K(s0, "stop_reason");
            int K23 = t80.K(s0, "trace_tag");
            int K24 = t80.K(s0, "backoff_on_system_interruptions");
            int K25 = t80.K(s0, "required_network_type");
            int K26 = t80.K(s0, "required_network_request");
            int K27 = t80.K(s0, "requires_charging");
            int K28 = t80.K(s0, "requires_device_idle");
            int K29 = t80.K(s0, "requires_battery_not_low");
            int K30 = t80.K(s0, "requires_storage_not_low");
            int K31 = t80.K(s0, "trigger_content_update_delay");
            int K32 = t80.K(s0, "trigger_max_content_delay");
            int K33 = t80.K(s0, "content_uri_triggers");
            ArrayList arrayList = new ArrayList();
            while (s0.p0()) {
                String c02 = s0.c0(K);
                int i3 = K13;
                int i4 = K14;
                j77 k = gy5.k((int) s0.getLong(K2));
                String c03 = s0.c0(K3);
                String c04 = s0.c0(K4);
                byte[] blob = s0.getBlob(K5);
                e41 e41Var = e41.b;
                e41 U = a34.U(blob);
                e41 U2 = a34.U(s0.getBlob(K6));
                long j = s0.getLong(K7);
                long j2 = s0.getLong(K8);
                long j3 = s0.getLong(K9);
                int i5 = (int) s0.getLong(K10);
                int i6 = K;
                int i7 = K2;
                c00 h = gy5.h((int) s0.getLong(K11));
                long j4 = s0.getLong(K12);
                long j5 = s0.getLong(i3);
                long j6 = s0.getLong(i4);
                int i8 = K15;
                long j7 = s0.getLong(i8);
                K15 = i8;
                int i9 = K16;
                int i10 = K3;
                if (((int) s0.getLong(i9)) != 0) {
                    z = true;
                } else {
                    z = false;
                }
                int i11 = K17;
                int i12 = K4;
                wg4 j8 = gy5.j((int) s0.getLong(i11));
                int i13 = K18;
                int i14 = (int) s0.getLong(i13);
                int i15 = K19;
                int i16 = (int) s0.getLong(i15);
                int i17 = K20;
                long j9 = s0.getLong(i17);
                int i18 = K21;
                int i19 = (int) s0.getLong(i18);
                K21 = i18;
                int i20 = K22;
                int i21 = (int) s0.getLong(i20);
                int i22 = K23;
                Boolean bool = null;
                if (s0.isNull(i22)) {
                    c0 = null;
                } else {
                    c0 = s0.c0(i22);
                }
                int i23 = K24;
                if (s0.isNull(i23)) {
                    i2 = i22;
                    K22 = i20;
                    valueOf = null;
                } else {
                    i2 = i22;
                    K22 = i20;
                    valueOf = Integer.valueOf((int) s0.getLong(i23));
                }
                if (valueOf != null) {
                    if (valueOf.intValue() != 0) {
                        z6 = true;
                    } else {
                        z6 = false;
                    }
                    bool = Boolean.valueOf(z6);
                }
                Boolean bool2 = bool;
                int i24 = K25;
                k94 i25 = gy5.i((int) s0.getLong(i24));
                int i26 = K26;
                f94 r = gy5.r(s0.getBlob(i26));
                int i27 = K27;
                if (((int) s0.getLong(i27)) != 0) {
                    z2 = true;
                } else {
                    z2 = false;
                }
                int i28 = K28;
                if (((int) s0.getLong(i28)) != 0) {
                    z3 = true;
                } else {
                    z3 = false;
                }
                int i29 = K29;
                if (((int) s0.getLong(i29)) != 0) {
                    z4 = true;
                } else {
                    z4 = false;
                }
                K29 = i29;
                int i30 = K30;
                if (((int) s0.getLong(i30)) != 0) {
                    z5 = true;
                } else {
                    z5 = false;
                }
                int i31 = K31;
                int i32 = K32;
                K31 = i31;
                int i33 = K33;
                arrayList.add(new z77(c02, k, c03, c04, U, U2, j, j2, j3, new qx0(r, i25, z2, z3, z4, z5, s0.getLong(i31), s0.getLong(i32), gy5.a(s0.getBlob(i33))), i5, h, j4, j5, j6, j7, z, j8, i14, i16, j9, i19, i21, c0, bool2));
                K28 = i28;
                K4 = i12;
                K17 = i11;
                K18 = i13;
                K19 = i15;
                K20 = i17;
                K23 = i2;
                K24 = i23;
                K25 = i24;
                K26 = i26;
                K27 = i27;
                K33 = i33;
                K32 = i32;
                K30 = i30;
                K = i6;
                K13 = i3;
                K14 = i4;
                K2 = i7;
                K3 = i10;
                K16 = i9;
            }
            s0.close();
            return arrayList;
        } catch (Throwable th) {
            s0.close();
            throw th;
        }
    }

    public static final List getAllUnblockedWork$lambda$0(String str, g85 g85Var) {
        boolean z;
        String c0;
        int i;
        int i2;
        Integer valueOf;
        boolean z2;
        boolean z3;
        boolean z4;
        boolean z5;
        boolean z6;
        g85Var.getClass();
        m85 s0 = g85Var.s0(str);
        try {
            int K = t80.K(s0, "id");
            int K2 = t80.K(s0, "state");
            int K3 = t80.K(s0, "worker_class_name");
            int K4 = t80.K(s0, "input_merger_class_name");
            int K5 = t80.K(s0, "input");
            int K6 = t80.K(s0, "output");
            int K7 = t80.K(s0, "initial_delay");
            int K8 = t80.K(s0, "interval_duration");
            int K9 = t80.K(s0, "flex_duration");
            int K10 = t80.K(s0, "run_attempt_count");
            int K11 = t80.K(s0, "backoff_policy");
            int K12 = t80.K(s0, "backoff_delay_duration");
            int K13 = t80.K(s0, "last_enqueue_time");
            int K14 = t80.K(s0, "minimum_retention_duration");
            int K15 = t80.K(s0, "schedule_requested_at");
            int K16 = t80.K(s0, "run_in_foreground");
            int K17 = t80.K(s0, "out_of_quota_policy");
            int K18 = t80.K(s0, "period_count");
            int K19 = t80.K(s0, "generation");
            int K20 = t80.K(s0, "next_schedule_time_override");
            int K21 = t80.K(s0, "next_schedule_time_override_generation");
            int K22 = t80.K(s0, "stop_reason");
            int K23 = t80.K(s0, "trace_tag");
            int K24 = t80.K(s0, "backoff_on_system_interruptions");
            int K25 = t80.K(s0, "required_network_type");
            int K26 = t80.K(s0, "required_network_request");
            int K27 = t80.K(s0, "requires_charging");
            int K28 = t80.K(s0, "requires_device_idle");
            int K29 = t80.K(s0, "requires_battery_not_low");
            int K30 = t80.K(s0, "requires_storage_not_low");
            int K31 = t80.K(s0, "trigger_content_update_delay");
            int K32 = t80.K(s0, "trigger_max_content_delay");
            int K33 = t80.K(s0, "content_uri_triggers");
            ArrayList arrayList = new ArrayList();
            while (s0.p0()) {
                String c02 = s0.c0(K);
                int i3 = K14;
                ArrayList arrayList2 = arrayList;
                j77 k = gy5.k((int) s0.getLong(K2));
                String c03 = s0.c0(K3);
                String c04 = s0.c0(K4);
                byte[] blob = s0.getBlob(K5);
                e41 e41Var = e41.b;
                e41 U = a34.U(blob);
                e41 U2 = a34.U(s0.getBlob(K6));
                long j = s0.getLong(K7);
                long j2 = s0.getLong(K8);
                long j3 = s0.getLong(K9);
                int i4 = (int) s0.getLong(K10);
                int i5 = K2;
                int i6 = K3;
                c00 h = gy5.h((int) s0.getLong(K11));
                long j4 = s0.getLong(K12);
                long j5 = s0.getLong(K13);
                long j6 = s0.getLong(i3);
                int i7 = K15;
                long j7 = s0.getLong(i7);
                int i8 = K;
                int i9 = K16;
                if (((int) s0.getLong(i9)) != 0) {
                    z = true;
                } else {
                    z = false;
                }
                int i10 = K17;
                int i11 = K4;
                wg4 j8 = gy5.j((int) s0.getLong(i10));
                int i12 = K18;
                int i13 = K5;
                int i14 = (int) s0.getLong(i12);
                int i15 = K19;
                int i16 = (int) s0.getLong(i15);
                int i17 = K20;
                long j9 = s0.getLong(i17);
                int i18 = K21;
                int i19 = (int) s0.getLong(i18);
                int i20 = K22;
                int i21 = (int) s0.getLong(i20);
                int i22 = K23;
                Boolean bool = null;
                if (s0.isNull(i22)) {
                    c0 = null;
                } else {
                    c0 = s0.c0(i22);
                }
                int i23 = K24;
                if (s0.isNull(i23)) {
                    i = i19;
                    i2 = i20;
                    valueOf = null;
                } else {
                    i = i19;
                    i2 = i20;
                    valueOf = Integer.valueOf((int) s0.getLong(i23));
                }
                if (valueOf != null) {
                    if (valueOf.intValue() != 0) {
                        z6 = true;
                    } else {
                        z6 = false;
                    }
                    bool = Boolean.valueOf(z6);
                }
                int i24 = K25;
                Boolean bool2 = bool;
                k94 i25 = gy5.i((int) s0.getLong(i24));
                int i26 = K26;
                f94 r = gy5.r(s0.getBlob(i26));
                K25 = i24;
                K26 = i26;
                int i27 = K27;
                if (((int) s0.getLong(i27)) != 0) {
                    z2 = true;
                } else {
                    z2 = false;
                }
                K27 = i27;
                int i28 = K28;
                if (((int) s0.getLong(i28)) != 0) {
                    z3 = true;
                } else {
                    z3 = false;
                }
                int i29 = K29;
                if (((int) s0.getLong(i29)) != 0) {
                    z4 = true;
                } else {
                    z4 = false;
                }
                K29 = i29;
                int i30 = K30;
                if (((int) s0.getLong(i30)) != 0) {
                    z5 = true;
                } else {
                    z5 = false;
                }
                int i31 = K31;
                int i32 = K32;
                int i33 = K33;
                K33 = i33;
                arrayList2.add(new z77(c02, k, c03, c04, U, U2, j, j2, j3, new qx0(r, i25, z2, z3, z4, z5, s0.getLong(i31), s0.getLong(i32), gy5.a(s0.getBlob(i33))), i4, h, j4, j5, j6, j7, z, j8, i14, i16, j9, i, i21, c0, bool2));
                K30 = i30;
                K4 = i11;
                K17 = i10;
                K19 = i15;
                K22 = i2;
                K24 = i23;
                K31 = i31;
                K32 = i32;
                K2 = i5;
                K14 = i3;
                K3 = i6;
                arrayList = arrayList2;
                K = i8;
                K15 = i7;
                K16 = i9;
                K20 = i17;
                K21 = i18;
                K23 = i22;
                K28 = i28;
                K5 = i13;
                K18 = i12;
            }
            ArrayList arrayList3 = arrayList;
            s0.close();
            return arrayList3;
        } catch (Throwable th) {
            s0.close();
            throw th;
        }
    }

    public static final List getAllUnfinishedWork$lambda$0(String str, g85 g85Var) {
        g85Var.getClass();
        m85 s0 = g85Var.s0(str);
        try {
            ArrayList arrayList = new ArrayList();
            while (s0.p0()) {
                arrayList.add(s0.c0(0));
            }
            return arrayList;
        } finally {
            s0.close();
        }
    }

    public static final List getAllWorkSpecIds$lambda$0(String str, g85 g85Var) {
        g85Var.getClass();
        m85 s0 = g85Var.s0(str);
        try {
            ArrayList arrayList = new ArrayList();
            while (s0.p0()) {
                arrayList.add(s0.c0(0));
            }
            return arrayList;
        } finally {
            s0.close();
        }
    }

    public static final List getAllWorkSpecIdsLiveData$lambda$0(String str, g85 g85Var) {
        g85Var.getClass();
        m85 s0 = g85Var.s0(str);
        try {
            ArrayList arrayList = new ArrayList();
            while (s0.p0()) {
                arrayList.add(s0.c0(0));
            }
            return arrayList;
        } finally {
            s0.close();
        }
    }

    public static final List getEligibleWorkForScheduling$lambda$0(String str, int i, g85 g85Var) {
        boolean z;
        String c0;
        int i2;
        Integer valueOf;
        boolean z2;
        boolean z3;
        boolean z4;
        boolean z5;
        boolean z6;
        g85Var.getClass();
        m85 s0 = g85Var.s0(str);
        try {
            s0.e(1, i);
            int K = t80.K(s0, "id");
            int K2 = t80.K(s0, "state");
            int K3 = t80.K(s0, "worker_class_name");
            int K4 = t80.K(s0, "input_merger_class_name");
            int K5 = t80.K(s0, "input");
            int K6 = t80.K(s0, "output");
            int K7 = t80.K(s0, "initial_delay");
            int K8 = t80.K(s0, "interval_duration");
            int K9 = t80.K(s0, "flex_duration");
            int K10 = t80.K(s0, "run_attempt_count");
            int K11 = t80.K(s0, "backoff_policy");
            int K12 = t80.K(s0, "backoff_delay_duration");
            int K13 = t80.K(s0, "last_enqueue_time");
            int K14 = t80.K(s0, "minimum_retention_duration");
            int K15 = t80.K(s0, "schedule_requested_at");
            int K16 = t80.K(s0, "run_in_foreground");
            int K17 = t80.K(s0, "out_of_quota_policy");
            int K18 = t80.K(s0, "period_count");
            int K19 = t80.K(s0, "generation");
            int K20 = t80.K(s0, "next_schedule_time_override");
            int K21 = t80.K(s0, "next_schedule_time_override_generation");
            int K22 = t80.K(s0, "stop_reason");
            int K23 = t80.K(s0, "trace_tag");
            int K24 = t80.K(s0, "backoff_on_system_interruptions");
            int K25 = t80.K(s0, "required_network_type");
            int K26 = t80.K(s0, "required_network_request");
            int K27 = t80.K(s0, "requires_charging");
            int K28 = t80.K(s0, "requires_device_idle");
            int K29 = t80.K(s0, "requires_battery_not_low");
            int K30 = t80.K(s0, "requires_storage_not_low");
            int K31 = t80.K(s0, "trigger_content_update_delay");
            int K32 = t80.K(s0, "trigger_max_content_delay");
            int K33 = t80.K(s0, "content_uri_triggers");
            ArrayList arrayList = new ArrayList();
            while (s0.p0()) {
                String c02 = s0.c0(K);
                int i3 = K13;
                int i4 = K14;
                j77 k = gy5.k((int) s0.getLong(K2));
                String c03 = s0.c0(K3);
                String c04 = s0.c0(K4);
                byte[] blob = s0.getBlob(K5);
                e41 e41Var = e41.b;
                e41 U = a34.U(blob);
                e41 U2 = a34.U(s0.getBlob(K6));
                long j = s0.getLong(K7);
                long j2 = s0.getLong(K8);
                long j3 = s0.getLong(K9);
                int i5 = (int) s0.getLong(K10);
                int i6 = K;
                int i7 = K2;
                c00 h = gy5.h((int) s0.getLong(K11));
                long j4 = s0.getLong(K12);
                long j5 = s0.getLong(i3);
                long j6 = s0.getLong(i4);
                int i8 = K15;
                long j7 = s0.getLong(i8);
                K15 = i8;
                int i9 = K16;
                int i10 = K3;
                if (((int) s0.getLong(i9)) != 0) {
                    z = true;
                } else {
                    z = false;
                }
                int i11 = K17;
                int i12 = K4;
                wg4 j8 = gy5.j((int) s0.getLong(i11));
                int i13 = K18;
                int i14 = (int) s0.getLong(i13);
                int i15 = K19;
                int i16 = (int) s0.getLong(i15);
                int i17 = K20;
                long j9 = s0.getLong(i17);
                int i18 = K21;
                int i19 = (int) s0.getLong(i18);
                K21 = i18;
                int i20 = K22;
                int i21 = (int) s0.getLong(i20);
                int i22 = K23;
                Boolean bool = null;
                if (s0.isNull(i22)) {
                    c0 = null;
                } else {
                    c0 = s0.c0(i22);
                }
                int i23 = K24;
                if (s0.isNull(i23)) {
                    i2 = i22;
                    K22 = i20;
                    valueOf = null;
                } else {
                    i2 = i22;
                    K22 = i20;
                    valueOf = Integer.valueOf((int) s0.getLong(i23));
                }
                if (valueOf != null) {
                    if (valueOf.intValue() != 0) {
                        z6 = true;
                    } else {
                        z6 = false;
                    }
                    bool = Boolean.valueOf(z6);
                }
                Boolean bool2 = bool;
                int i24 = K25;
                k94 i25 = gy5.i((int) s0.getLong(i24));
                int i26 = K26;
                f94 r = gy5.r(s0.getBlob(i26));
                int i27 = K27;
                if (((int) s0.getLong(i27)) != 0) {
                    z2 = true;
                } else {
                    z2 = false;
                }
                int i28 = K28;
                if (((int) s0.getLong(i28)) != 0) {
                    z3 = true;
                } else {
                    z3 = false;
                }
                int i29 = K29;
                if (((int) s0.getLong(i29)) != 0) {
                    z4 = true;
                } else {
                    z4 = false;
                }
                K29 = i29;
                int i30 = K30;
                if (((int) s0.getLong(i30)) != 0) {
                    z5 = true;
                } else {
                    z5 = false;
                }
                int i31 = K31;
                int i32 = K32;
                K31 = i31;
                int i33 = K33;
                arrayList.add(new z77(c02, k, c03, c04, U, U2, j, j2, j3, new qx0(r, i25, z2, z3, z4, z5, s0.getLong(i31), s0.getLong(i32), gy5.a(s0.getBlob(i33))), i5, h, j4, j5, j6, j7, z, j8, i14, i16, j9, i19, i21, c0, bool2));
                K28 = i28;
                K4 = i12;
                K17 = i11;
                K18 = i13;
                K19 = i15;
                K20 = i17;
                K23 = i2;
                K24 = i23;
                K25 = i24;
                K26 = i26;
                K27 = i27;
                K33 = i33;
                K32 = i32;
                K30 = i30;
                K = i6;
                K13 = i3;
                K14 = i4;
                K2 = i7;
                K3 = i10;
                K16 = i9;
            }
            s0.close();
            return arrayList;
        } catch (Throwable th) {
            s0.close();
            throw th;
        }
    }

    public static final List getEligibleWorkForSchedulingWithContentUris$lambda$0(String str, g85 g85Var) {
        boolean z;
        String c0;
        int i;
        int i2;
        Integer valueOf;
        boolean z2;
        boolean z3;
        boolean z4;
        boolean z5;
        boolean z6;
        g85Var.getClass();
        m85 s0 = g85Var.s0(str);
        try {
            int K = t80.K(s0, "id");
            int K2 = t80.K(s0, "state");
            int K3 = t80.K(s0, "worker_class_name");
            int K4 = t80.K(s0, "input_merger_class_name");
            int K5 = t80.K(s0, "input");
            int K6 = t80.K(s0, "output");
            int K7 = t80.K(s0, "initial_delay");
            int K8 = t80.K(s0, "interval_duration");
            int K9 = t80.K(s0, "flex_duration");
            int K10 = t80.K(s0, "run_attempt_count");
            int K11 = t80.K(s0, "backoff_policy");
            int K12 = t80.K(s0, "backoff_delay_duration");
            int K13 = t80.K(s0, "last_enqueue_time");
            int K14 = t80.K(s0, "minimum_retention_duration");
            int K15 = t80.K(s0, "schedule_requested_at");
            int K16 = t80.K(s0, "run_in_foreground");
            int K17 = t80.K(s0, "out_of_quota_policy");
            int K18 = t80.K(s0, "period_count");
            int K19 = t80.K(s0, "generation");
            int K20 = t80.K(s0, "next_schedule_time_override");
            int K21 = t80.K(s0, "next_schedule_time_override_generation");
            int K22 = t80.K(s0, "stop_reason");
            int K23 = t80.K(s0, "trace_tag");
            int K24 = t80.K(s0, "backoff_on_system_interruptions");
            int K25 = t80.K(s0, "required_network_type");
            int K26 = t80.K(s0, "required_network_request");
            int K27 = t80.K(s0, "requires_charging");
            int K28 = t80.K(s0, "requires_device_idle");
            int K29 = t80.K(s0, "requires_battery_not_low");
            int K30 = t80.K(s0, "requires_storage_not_low");
            int K31 = t80.K(s0, "trigger_content_update_delay");
            int K32 = t80.K(s0, "trigger_max_content_delay");
            int K33 = t80.K(s0, "content_uri_triggers");
            ArrayList arrayList = new ArrayList();
            while (s0.p0()) {
                String c02 = s0.c0(K);
                int i3 = K14;
                ArrayList arrayList2 = arrayList;
                j77 k = gy5.k((int) s0.getLong(K2));
                String c03 = s0.c0(K3);
                String c04 = s0.c0(K4);
                byte[] blob = s0.getBlob(K5);
                e41 e41Var = e41.b;
                e41 U = a34.U(blob);
                e41 U2 = a34.U(s0.getBlob(K6));
                long j = s0.getLong(K7);
                long j2 = s0.getLong(K8);
                long j3 = s0.getLong(K9);
                int i4 = (int) s0.getLong(K10);
                int i5 = K2;
                int i6 = K3;
                c00 h = gy5.h((int) s0.getLong(K11));
                long j4 = s0.getLong(K12);
                long j5 = s0.getLong(K13);
                long j6 = s0.getLong(i3);
                int i7 = K15;
                long j7 = s0.getLong(i7);
                int i8 = K;
                int i9 = K16;
                if (((int) s0.getLong(i9)) != 0) {
                    z = true;
                } else {
                    z = false;
                }
                int i10 = K17;
                int i11 = K4;
                wg4 j8 = gy5.j((int) s0.getLong(i10));
                int i12 = K18;
                int i13 = K5;
                int i14 = (int) s0.getLong(i12);
                int i15 = K19;
                int i16 = (int) s0.getLong(i15);
                int i17 = K20;
                long j9 = s0.getLong(i17);
                int i18 = K21;
                int i19 = (int) s0.getLong(i18);
                int i20 = K22;
                int i21 = (int) s0.getLong(i20);
                int i22 = K23;
                Boolean bool = null;
                if (s0.isNull(i22)) {
                    c0 = null;
                } else {
                    c0 = s0.c0(i22);
                }
                int i23 = K24;
                if (s0.isNull(i23)) {
                    i = i19;
                    i2 = i20;
                    valueOf = null;
                } else {
                    i = i19;
                    i2 = i20;
                    valueOf = Integer.valueOf((int) s0.getLong(i23));
                }
                if (valueOf != null) {
                    if (valueOf.intValue() != 0) {
                        z6 = true;
                    } else {
                        z6 = false;
                    }
                    bool = Boolean.valueOf(z6);
                }
                int i24 = K25;
                Boolean bool2 = bool;
                k94 i25 = gy5.i((int) s0.getLong(i24));
                int i26 = K26;
                f94 r = gy5.r(s0.getBlob(i26));
                K25 = i24;
                K26 = i26;
                int i27 = K27;
                if (((int) s0.getLong(i27)) != 0) {
                    z2 = true;
                } else {
                    z2 = false;
                }
                K27 = i27;
                int i28 = K28;
                if (((int) s0.getLong(i28)) != 0) {
                    z3 = true;
                } else {
                    z3 = false;
                }
                int i29 = K29;
                if (((int) s0.getLong(i29)) != 0) {
                    z4 = true;
                } else {
                    z4 = false;
                }
                K29 = i29;
                int i30 = K30;
                if (((int) s0.getLong(i30)) != 0) {
                    z5 = true;
                } else {
                    z5 = false;
                }
                int i31 = K31;
                int i32 = K32;
                int i33 = K33;
                K33 = i33;
                arrayList2.add(new z77(c02, k, c03, c04, U, U2, j, j2, j3, new qx0(r, i25, z2, z3, z4, z5, s0.getLong(i31), s0.getLong(i32), gy5.a(s0.getBlob(i33))), i4, h, j4, j5, j6, j7, z, j8, i14, i16, j9, i, i21, c0, bool2));
                K30 = i30;
                K4 = i11;
                K17 = i10;
                K19 = i15;
                K22 = i2;
                K24 = i23;
                K31 = i31;
                K32 = i32;
                K2 = i5;
                K14 = i3;
                K3 = i6;
                arrayList = arrayList2;
                K = i8;
                K15 = i7;
                K16 = i9;
                K20 = i17;
                K21 = i18;
                K23 = i22;
                K28 = i28;
                K5 = i13;
                K18 = i12;
            }
            ArrayList arrayList3 = arrayList;
            s0.close();
            return arrayList3;
        } catch (Throwable th) {
            s0.close();
            throw th;
        }
    }

    public static final List getInputsFromPrerequisites$lambda$0(String str, String str2, g85 g85Var) {
        g85Var.getClass();
        m85 s0 = g85Var.s0(str);
        try {
            s0.J(1, str2);
            ArrayList arrayList = new ArrayList();
            while (s0.p0()) {
                byte[] blob = s0.getBlob(0);
                e41 e41Var = e41.b;
                arrayList.add(a34.U(blob));
            }
            return arrayList;
        } finally {
            s0.close();
        }
    }

    public static final List getRecentlyCompletedWork$lambda$0(String str, long j, g85 g85Var) {
        boolean z;
        String c0;
        int i;
        Integer valueOf;
        boolean z2;
        boolean z3;
        boolean z4;
        boolean z5;
        boolean z6;
        g85Var.getClass();
        m85 s0 = g85Var.s0(str);
        try {
            s0.e(1, j);
            int K = t80.K(s0, "id");
            int K2 = t80.K(s0, "state");
            int K3 = t80.K(s0, "worker_class_name");
            int K4 = t80.K(s0, "input_merger_class_name");
            int K5 = t80.K(s0, "input");
            int K6 = t80.K(s0, "output");
            int K7 = t80.K(s0, "initial_delay");
            int K8 = t80.K(s0, "interval_duration");
            int K9 = t80.K(s0, "flex_duration");
            int K10 = t80.K(s0, "run_attempt_count");
            int K11 = t80.K(s0, "backoff_policy");
            int K12 = t80.K(s0, "backoff_delay_duration");
            int K13 = t80.K(s0, "last_enqueue_time");
            int K14 = t80.K(s0, "minimum_retention_duration");
            int K15 = t80.K(s0, "schedule_requested_at");
            int K16 = t80.K(s0, "run_in_foreground");
            int K17 = t80.K(s0, "out_of_quota_policy");
            int K18 = t80.K(s0, "period_count");
            int K19 = t80.K(s0, "generation");
            int K20 = t80.K(s0, "next_schedule_time_override");
            int K21 = t80.K(s0, "next_schedule_time_override_generation");
            int K22 = t80.K(s0, "stop_reason");
            int K23 = t80.K(s0, "trace_tag");
            int K24 = t80.K(s0, "backoff_on_system_interruptions");
            int K25 = t80.K(s0, "required_network_type");
            int K26 = t80.K(s0, "required_network_request");
            int K27 = t80.K(s0, "requires_charging");
            int K28 = t80.K(s0, "requires_device_idle");
            int K29 = t80.K(s0, "requires_battery_not_low");
            int K30 = t80.K(s0, "requires_storage_not_low");
            int K31 = t80.K(s0, "trigger_content_update_delay");
            int K32 = t80.K(s0, "trigger_max_content_delay");
            int K33 = t80.K(s0, "content_uri_triggers");
            ArrayList arrayList = new ArrayList();
            while (s0.p0()) {
                String c02 = s0.c0(K);
                int i2 = K13;
                int i3 = K14;
                j77 k = gy5.k((int) s0.getLong(K2));
                String c03 = s0.c0(K3);
                String c04 = s0.c0(K4);
                byte[] blob = s0.getBlob(K5);
                e41 e41Var = e41.b;
                e41 U = a34.U(blob);
                e41 U2 = a34.U(s0.getBlob(K6));
                long j2 = s0.getLong(K7);
                long j3 = s0.getLong(K8);
                long j4 = s0.getLong(K9);
                int i4 = (int) s0.getLong(K10);
                int i5 = K;
                int i6 = K2;
                c00 h = gy5.h((int) s0.getLong(K11));
                long j5 = s0.getLong(K12);
                long j6 = s0.getLong(i2);
                long j7 = s0.getLong(i3);
                int i7 = K15;
                long j8 = s0.getLong(i7);
                K15 = i7;
                int i8 = K16;
                int i9 = K3;
                if (((int) s0.getLong(i8)) != 0) {
                    z = true;
                } else {
                    z = false;
                }
                int i10 = K17;
                int i11 = K4;
                wg4 j9 = gy5.j((int) s0.getLong(i10));
                int i12 = K18;
                int i13 = (int) s0.getLong(i12);
                int i14 = K19;
                int i15 = (int) s0.getLong(i14);
                int i16 = K20;
                long j10 = s0.getLong(i16);
                int i17 = K21;
                int i18 = (int) s0.getLong(i17);
                K21 = i17;
                int i19 = K22;
                int i20 = (int) s0.getLong(i19);
                int i21 = K23;
                Boolean bool = null;
                if (s0.isNull(i21)) {
                    c0 = null;
                } else {
                    c0 = s0.c0(i21);
                }
                int i22 = K24;
                if (s0.isNull(i22)) {
                    i = i21;
                    K22 = i19;
                    valueOf = null;
                } else {
                    i = i21;
                    K22 = i19;
                    valueOf = Integer.valueOf((int) s0.getLong(i22));
                }
                if (valueOf != null) {
                    if (valueOf.intValue() != 0) {
                        z6 = true;
                    } else {
                        z6 = false;
                    }
                    bool = Boolean.valueOf(z6);
                }
                Boolean bool2 = bool;
                int i23 = K25;
                k94 i24 = gy5.i((int) s0.getLong(i23));
                int i25 = K26;
                f94 r = gy5.r(s0.getBlob(i25));
                int i26 = K27;
                if (((int) s0.getLong(i26)) != 0) {
                    z2 = true;
                } else {
                    z2 = false;
                }
                int i27 = K28;
                if (((int) s0.getLong(i27)) != 0) {
                    z3 = true;
                } else {
                    z3 = false;
                }
                int i28 = K29;
                if (((int) s0.getLong(i28)) != 0) {
                    z4 = true;
                } else {
                    z4 = false;
                }
                K29 = i28;
                int i29 = K30;
                if (((int) s0.getLong(i29)) != 0) {
                    z5 = true;
                } else {
                    z5 = false;
                }
                int i30 = K31;
                int i31 = K32;
                K31 = i30;
                int i32 = K33;
                arrayList.add(new z77(c02, k, c03, c04, U, U2, j2, j3, j4, new qx0(r, i24, z2, z3, z4, z5, s0.getLong(i30), s0.getLong(i31), gy5.a(s0.getBlob(i32))), i4, h, j5, j6, j7, j8, z, j9, i13, i15, j10, i18, i20, c0, bool2));
                K4 = i11;
                K17 = i10;
                K18 = i12;
                K19 = i14;
                K20 = i16;
                K23 = i;
                K24 = i22;
                K25 = i23;
                K26 = i25;
                K27 = i26;
                K28 = i27;
                K33 = i32;
                K32 = i31;
                K30 = i29;
                K = i5;
                K13 = i2;
                K14 = i3;
                K2 = i6;
                K3 = i9;
                K16 = i8;
            }
            s0.close();
            return arrayList;
        } catch (Throwable th) {
            s0.close();
            throw th;
        }
    }

    public static final List getRunningWork$lambda$0(String str, g85 g85Var) {
        boolean z;
        String c0;
        int i;
        int i2;
        Integer valueOf;
        boolean z2;
        boolean z3;
        boolean z4;
        boolean z5;
        boolean z6;
        g85Var.getClass();
        m85 s0 = g85Var.s0(str);
        try {
            int K = t80.K(s0, "id");
            int K2 = t80.K(s0, "state");
            int K3 = t80.K(s0, "worker_class_name");
            int K4 = t80.K(s0, "input_merger_class_name");
            int K5 = t80.K(s0, "input");
            int K6 = t80.K(s0, "output");
            int K7 = t80.K(s0, "initial_delay");
            int K8 = t80.K(s0, "interval_duration");
            int K9 = t80.K(s0, "flex_duration");
            int K10 = t80.K(s0, "run_attempt_count");
            int K11 = t80.K(s0, "backoff_policy");
            int K12 = t80.K(s0, "backoff_delay_duration");
            int K13 = t80.K(s0, "last_enqueue_time");
            int K14 = t80.K(s0, "minimum_retention_duration");
            int K15 = t80.K(s0, "schedule_requested_at");
            int K16 = t80.K(s0, "run_in_foreground");
            int K17 = t80.K(s0, "out_of_quota_policy");
            int K18 = t80.K(s0, "period_count");
            int K19 = t80.K(s0, "generation");
            int K20 = t80.K(s0, "next_schedule_time_override");
            int K21 = t80.K(s0, "next_schedule_time_override_generation");
            int K22 = t80.K(s0, "stop_reason");
            int K23 = t80.K(s0, "trace_tag");
            int K24 = t80.K(s0, "backoff_on_system_interruptions");
            int K25 = t80.K(s0, "required_network_type");
            int K26 = t80.K(s0, "required_network_request");
            int K27 = t80.K(s0, "requires_charging");
            int K28 = t80.K(s0, "requires_device_idle");
            int K29 = t80.K(s0, "requires_battery_not_low");
            int K30 = t80.K(s0, "requires_storage_not_low");
            int K31 = t80.K(s0, "trigger_content_update_delay");
            int K32 = t80.K(s0, "trigger_max_content_delay");
            int K33 = t80.K(s0, "content_uri_triggers");
            ArrayList arrayList = new ArrayList();
            while (s0.p0()) {
                String c02 = s0.c0(K);
                int i3 = K14;
                ArrayList arrayList2 = arrayList;
                j77 k = gy5.k((int) s0.getLong(K2));
                String c03 = s0.c0(K3);
                String c04 = s0.c0(K4);
                byte[] blob = s0.getBlob(K5);
                e41 e41Var = e41.b;
                e41 U = a34.U(blob);
                e41 U2 = a34.U(s0.getBlob(K6));
                long j = s0.getLong(K7);
                long j2 = s0.getLong(K8);
                long j3 = s0.getLong(K9);
                int i4 = (int) s0.getLong(K10);
                int i5 = K2;
                int i6 = K3;
                c00 h = gy5.h((int) s0.getLong(K11));
                long j4 = s0.getLong(K12);
                long j5 = s0.getLong(K13);
                long j6 = s0.getLong(i3);
                int i7 = K15;
                long j7 = s0.getLong(i7);
                int i8 = K;
                int i9 = K16;
                if (((int) s0.getLong(i9)) != 0) {
                    z = true;
                } else {
                    z = false;
                }
                int i10 = K17;
                int i11 = K4;
                wg4 j8 = gy5.j((int) s0.getLong(i10));
                int i12 = K18;
                int i13 = K5;
                int i14 = (int) s0.getLong(i12);
                int i15 = K19;
                int i16 = (int) s0.getLong(i15);
                int i17 = K20;
                long j9 = s0.getLong(i17);
                int i18 = K21;
                int i19 = (int) s0.getLong(i18);
                int i20 = K22;
                int i21 = (int) s0.getLong(i20);
                int i22 = K23;
                Boolean bool = null;
                if (s0.isNull(i22)) {
                    c0 = null;
                } else {
                    c0 = s0.c0(i22);
                }
                int i23 = K24;
                if (s0.isNull(i23)) {
                    i = i19;
                    i2 = i20;
                    valueOf = null;
                } else {
                    i = i19;
                    i2 = i20;
                    valueOf = Integer.valueOf((int) s0.getLong(i23));
                }
                if (valueOf != null) {
                    if (valueOf.intValue() != 0) {
                        z6 = true;
                    } else {
                        z6 = false;
                    }
                    bool = Boolean.valueOf(z6);
                }
                int i24 = K25;
                Boolean bool2 = bool;
                k94 i25 = gy5.i((int) s0.getLong(i24));
                int i26 = K26;
                f94 r = gy5.r(s0.getBlob(i26));
                K25 = i24;
                K26 = i26;
                int i27 = K27;
                if (((int) s0.getLong(i27)) != 0) {
                    z2 = true;
                } else {
                    z2 = false;
                }
                K27 = i27;
                int i28 = K28;
                if (((int) s0.getLong(i28)) != 0) {
                    z3 = true;
                } else {
                    z3 = false;
                }
                int i29 = K29;
                if (((int) s0.getLong(i29)) != 0) {
                    z4 = true;
                } else {
                    z4 = false;
                }
                K29 = i29;
                int i30 = K30;
                if (((int) s0.getLong(i30)) != 0) {
                    z5 = true;
                } else {
                    z5 = false;
                }
                int i31 = K31;
                int i32 = K32;
                int i33 = K33;
                K33 = i33;
                arrayList2.add(new z77(c02, k, c03, c04, U, U2, j, j2, j3, new qx0(r, i25, z2, z3, z4, z5, s0.getLong(i31), s0.getLong(i32), gy5.a(s0.getBlob(i33))), i4, h, j4, j5, j6, j7, z, j8, i14, i16, j9, i, i21, c0, bool2));
                K30 = i30;
                K4 = i11;
                K17 = i10;
                K19 = i15;
                K22 = i2;
                K24 = i23;
                K31 = i31;
                K32 = i32;
                K2 = i5;
                K14 = i3;
                K3 = i6;
                arrayList = arrayList2;
                K = i8;
                K15 = i7;
                K16 = i9;
                K20 = i17;
                K21 = i18;
                K23 = i22;
                K28 = i28;
                K5 = i13;
                K18 = i12;
            }
            ArrayList arrayList3 = arrayList;
            s0.close();
            return arrayList3;
        } catch (Throwable th) {
            s0.close();
            throw th;
        }
    }

    public static final Long getScheduleRequestedAtLiveData$lambda$0(String str, String str2, g85 g85Var) {
        g85Var.getClass();
        m85 s0 = g85Var.s0(str);
        try {
            s0.J(1, str2);
            Long l = null;
            if (s0.p0() && !s0.isNull(0)) {
                l = Long.valueOf(s0.getLong(0));
            }
            return l;
        } finally {
            s0.close();
        }
    }

    public static final List getScheduledWork$lambda$0(String str, g85 g85Var) {
        boolean z;
        String c0;
        int i;
        int i2;
        Integer valueOf;
        boolean z2;
        boolean z3;
        boolean z4;
        boolean z5;
        boolean z6;
        g85Var.getClass();
        m85 s0 = g85Var.s0(str);
        try {
            int K = t80.K(s0, "id");
            int K2 = t80.K(s0, "state");
            int K3 = t80.K(s0, "worker_class_name");
            int K4 = t80.K(s0, "input_merger_class_name");
            int K5 = t80.K(s0, "input");
            int K6 = t80.K(s0, "output");
            int K7 = t80.K(s0, "initial_delay");
            int K8 = t80.K(s0, "interval_duration");
            int K9 = t80.K(s0, "flex_duration");
            int K10 = t80.K(s0, "run_attempt_count");
            int K11 = t80.K(s0, "backoff_policy");
            int K12 = t80.K(s0, "backoff_delay_duration");
            int K13 = t80.K(s0, "last_enqueue_time");
            int K14 = t80.K(s0, "minimum_retention_duration");
            int K15 = t80.K(s0, "schedule_requested_at");
            int K16 = t80.K(s0, "run_in_foreground");
            int K17 = t80.K(s0, "out_of_quota_policy");
            int K18 = t80.K(s0, "period_count");
            int K19 = t80.K(s0, "generation");
            int K20 = t80.K(s0, "next_schedule_time_override");
            int K21 = t80.K(s0, "next_schedule_time_override_generation");
            int K22 = t80.K(s0, "stop_reason");
            int K23 = t80.K(s0, "trace_tag");
            int K24 = t80.K(s0, "backoff_on_system_interruptions");
            int K25 = t80.K(s0, "required_network_type");
            int K26 = t80.K(s0, "required_network_request");
            int K27 = t80.K(s0, "requires_charging");
            int K28 = t80.K(s0, "requires_device_idle");
            int K29 = t80.K(s0, "requires_battery_not_low");
            int K30 = t80.K(s0, "requires_storage_not_low");
            int K31 = t80.K(s0, "trigger_content_update_delay");
            int K32 = t80.K(s0, "trigger_max_content_delay");
            int K33 = t80.K(s0, "content_uri_triggers");
            ArrayList arrayList = new ArrayList();
            while (s0.p0()) {
                String c02 = s0.c0(K);
                int i3 = K14;
                ArrayList arrayList2 = arrayList;
                j77 k = gy5.k((int) s0.getLong(K2));
                String c03 = s0.c0(K3);
                String c04 = s0.c0(K4);
                byte[] blob = s0.getBlob(K5);
                e41 e41Var = e41.b;
                e41 U = a34.U(blob);
                e41 U2 = a34.U(s0.getBlob(K6));
                long j = s0.getLong(K7);
                long j2 = s0.getLong(K8);
                long j3 = s0.getLong(K9);
                int i4 = (int) s0.getLong(K10);
                int i5 = K2;
                int i6 = K3;
                c00 h = gy5.h((int) s0.getLong(K11));
                long j4 = s0.getLong(K12);
                long j5 = s0.getLong(K13);
                long j6 = s0.getLong(i3);
                int i7 = K15;
                long j7 = s0.getLong(i7);
                int i8 = K;
                int i9 = K16;
                if (((int) s0.getLong(i9)) != 0) {
                    z = true;
                } else {
                    z = false;
                }
                int i10 = K17;
                int i11 = K4;
                wg4 j8 = gy5.j((int) s0.getLong(i10));
                int i12 = K18;
                int i13 = K5;
                int i14 = (int) s0.getLong(i12);
                int i15 = K19;
                int i16 = (int) s0.getLong(i15);
                int i17 = K20;
                long j9 = s0.getLong(i17);
                int i18 = K21;
                int i19 = (int) s0.getLong(i18);
                int i20 = K22;
                int i21 = (int) s0.getLong(i20);
                int i22 = K23;
                Boolean bool = null;
                if (s0.isNull(i22)) {
                    c0 = null;
                } else {
                    c0 = s0.c0(i22);
                }
                int i23 = K24;
                if (s0.isNull(i23)) {
                    i = i19;
                    i2 = i20;
                    valueOf = null;
                } else {
                    i = i19;
                    i2 = i20;
                    valueOf = Integer.valueOf((int) s0.getLong(i23));
                }
                if (valueOf != null) {
                    if (valueOf.intValue() != 0) {
                        z6 = true;
                    } else {
                        z6 = false;
                    }
                    bool = Boolean.valueOf(z6);
                }
                int i24 = K25;
                Boolean bool2 = bool;
                k94 i25 = gy5.i((int) s0.getLong(i24));
                int i26 = K26;
                f94 r = gy5.r(s0.getBlob(i26));
                K25 = i24;
                K26 = i26;
                int i27 = K27;
                if (((int) s0.getLong(i27)) != 0) {
                    z2 = true;
                } else {
                    z2 = false;
                }
                K27 = i27;
                int i28 = K28;
                if (((int) s0.getLong(i28)) != 0) {
                    z3 = true;
                } else {
                    z3 = false;
                }
                int i29 = K29;
                if (((int) s0.getLong(i29)) != 0) {
                    z4 = true;
                } else {
                    z4 = false;
                }
                K29 = i29;
                int i30 = K30;
                if (((int) s0.getLong(i30)) != 0) {
                    z5 = true;
                } else {
                    z5 = false;
                }
                int i31 = K31;
                int i32 = K32;
                int i33 = K33;
                K33 = i33;
                arrayList2.add(new z77(c02, k, c03, c04, U, U2, j, j2, j3, new qx0(r, i25, z2, z3, z4, z5, s0.getLong(i31), s0.getLong(i32), gy5.a(s0.getBlob(i33))), i4, h, j4, j5, j6, j7, z, j8, i14, i16, j9, i, i21, c0, bool2));
                K30 = i30;
                K4 = i11;
                K17 = i10;
                K19 = i15;
                K22 = i2;
                K24 = i23;
                K31 = i31;
                K32 = i32;
                K2 = i5;
                K14 = i3;
                K3 = i6;
                arrayList = arrayList2;
                K = i8;
                K15 = i7;
                K16 = i9;
                K20 = i17;
                K21 = i18;
                K23 = i22;
                K28 = i28;
                K5 = i13;
                K18 = i12;
            }
            ArrayList arrayList3 = arrayList;
            s0.close();
            return arrayList3;
        } catch (Throwable th) {
            s0.close();
            throw th;
        }
    }

    public static final List getScheduledWorkWithContentUris$lambda$0(String str, g85 g85Var) {
        boolean z;
        String c0;
        int i;
        int i2;
        Integer valueOf;
        boolean z2;
        boolean z3;
        boolean z4;
        boolean z5;
        boolean z6;
        g85Var.getClass();
        m85 s0 = g85Var.s0(str);
        try {
            int K = t80.K(s0, "id");
            int K2 = t80.K(s0, "state");
            int K3 = t80.K(s0, "worker_class_name");
            int K4 = t80.K(s0, "input_merger_class_name");
            int K5 = t80.K(s0, "input");
            int K6 = t80.K(s0, "output");
            int K7 = t80.K(s0, "initial_delay");
            int K8 = t80.K(s0, "interval_duration");
            int K9 = t80.K(s0, "flex_duration");
            int K10 = t80.K(s0, "run_attempt_count");
            int K11 = t80.K(s0, "backoff_policy");
            int K12 = t80.K(s0, "backoff_delay_duration");
            int K13 = t80.K(s0, "last_enqueue_time");
            int K14 = t80.K(s0, "minimum_retention_duration");
            int K15 = t80.K(s0, "schedule_requested_at");
            int K16 = t80.K(s0, "run_in_foreground");
            int K17 = t80.K(s0, "out_of_quota_policy");
            int K18 = t80.K(s0, "period_count");
            int K19 = t80.K(s0, "generation");
            int K20 = t80.K(s0, "next_schedule_time_override");
            int K21 = t80.K(s0, "next_schedule_time_override_generation");
            int K22 = t80.K(s0, "stop_reason");
            int K23 = t80.K(s0, "trace_tag");
            int K24 = t80.K(s0, "backoff_on_system_interruptions");
            int K25 = t80.K(s0, "required_network_type");
            int K26 = t80.K(s0, "required_network_request");
            int K27 = t80.K(s0, "requires_charging");
            int K28 = t80.K(s0, "requires_device_idle");
            int K29 = t80.K(s0, "requires_battery_not_low");
            int K30 = t80.K(s0, "requires_storage_not_low");
            int K31 = t80.K(s0, "trigger_content_update_delay");
            int K32 = t80.K(s0, "trigger_max_content_delay");
            int K33 = t80.K(s0, "content_uri_triggers");
            ArrayList arrayList = new ArrayList();
            while (s0.p0()) {
                String c02 = s0.c0(K);
                int i3 = K14;
                ArrayList arrayList2 = arrayList;
                j77 k = gy5.k((int) s0.getLong(K2));
                String c03 = s0.c0(K3);
                String c04 = s0.c0(K4);
                byte[] blob = s0.getBlob(K5);
                e41 e41Var = e41.b;
                e41 U = a34.U(blob);
                e41 U2 = a34.U(s0.getBlob(K6));
                long j = s0.getLong(K7);
                long j2 = s0.getLong(K8);
                long j3 = s0.getLong(K9);
                int i4 = (int) s0.getLong(K10);
                int i5 = K2;
                int i6 = K3;
                c00 h = gy5.h((int) s0.getLong(K11));
                long j4 = s0.getLong(K12);
                long j5 = s0.getLong(K13);
                long j6 = s0.getLong(i3);
                int i7 = K15;
                long j7 = s0.getLong(i7);
                int i8 = K;
                int i9 = K16;
                if (((int) s0.getLong(i9)) != 0) {
                    z = true;
                } else {
                    z = false;
                }
                int i10 = K17;
                int i11 = K4;
                wg4 j8 = gy5.j((int) s0.getLong(i10));
                int i12 = K18;
                int i13 = K5;
                int i14 = (int) s0.getLong(i12);
                int i15 = K19;
                int i16 = (int) s0.getLong(i15);
                int i17 = K20;
                long j9 = s0.getLong(i17);
                int i18 = K21;
                int i19 = (int) s0.getLong(i18);
                int i20 = K22;
                int i21 = (int) s0.getLong(i20);
                int i22 = K23;
                Boolean bool = null;
                if (s0.isNull(i22)) {
                    c0 = null;
                } else {
                    c0 = s0.c0(i22);
                }
                int i23 = K24;
                if (s0.isNull(i23)) {
                    i = i19;
                    i2 = i20;
                    valueOf = null;
                } else {
                    i = i19;
                    i2 = i20;
                    valueOf = Integer.valueOf((int) s0.getLong(i23));
                }
                if (valueOf != null) {
                    if (valueOf.intValue() != 0) {
                        z6 = true;
                    } else {
                        z6 = false;
                    }
                    bool = Boolean.valueOf(z6);
                }
                int i24 = K25;
                Boolean bool2 = bool;
                k94 i25 = gy5.i((int) s0.getLong(i24));
                int i26 = K26;
                f94 r = gy5.r(s0.getBlob(i26));
                K25 = i24;
                K26 = i26;
                int i27 = K27;
                if (((int) s0.getLong(i27)) != 0) {
                    z2 = true;
                } else {
                    z2 = false;
                }
                K27 = i27;
                int i28 = K28;
                if (((int) s0.getLong(i28)) != 0) {
                    z3 = true;
                } else {
                    z3 = false;
                }
                int i29 = K29;
                if (((int) s0.getLong(i29)) != 0) {
                    z4 = true;
                } else {
                    z4 = false;
                }
                K29 = i29;
                int i30 = K30;
                if (((int) s0.getLong(i30)) != 0) {
                    z5 = true;
                } else {
                    z5 = false;
                }
                int i31 = K31;
                int i32 = K32;
                int i33 = K33;
                K33 = i33;
                arrayList2.add(new z77(c02, k, c03, c04, U, U2, j, j2, j3, new qx0(r, i25, z2, z3, z4, z5, s0.getLong(i31), s0.getLong(i32), gy5.a(s0.getBlob(i33))), i4, h, j4, j5, j6, j7, z, j8, i14, i16, j9, i, i21, c0, bool2));
                K30 = i30;
                K4 = i11;
                K17 = i10;
                K19 = i15;
                K22 = i2;
                K24 = i23;
                K31 = i31;
                K32 = i32;
                K2 = i5;
                K14 = i3;
                K3 = i6;
                arrayList = arrayList2;
                K = i8;
                K15 = i7;
                K16 = i9;
                K20 = i17;
                K21 = i18;
                K23 = i22;
                K28 = i28;
                K5 = i13;
                K18 = i12;
            }
            ArrayList arrayList3 = arrayList;
            s0.close();
            return arrayList3;
        } catch (Throwable th) {
            s0.close();
            throw th;
        }
    }

    public static final j77 getState$lambda$0(String str, String str2, g85 g85Var) {
        Integer valueOf;
        g85Var.getClass();
        m85 s0 = g85Var.s0(str);
        try {
            s0.J(1, str2);
            j77 j77Var = null;
            if (s0.p0()) {
                if (s0.isNull(0)) {
                    valueOf = null;
                } else {
                    valueOf = Integer.valueOf((int) s0.getLong(0));
                }
                if (valueOf != null) {
                    j77Var = gy5.k(valueOf.intValue());
                }
            }
            return j77Var;
        } finally {
            s0.close();
        }
    }

    public static final List getUnfinishedWorkWithName$lambda$0(String str, String str2, g85 g85Var) {
        g85Var.getClass();
        m85 s0 = g85Var.s0(str);
        try {
            s0.J(1, str2);
            ArrayList arrayList = new ArrayList();
            while (s0.p0()) {
                arrayList.add(s0.c0(0));
            }
            return arrayList;
        } finally {
            s0.close();
        }
    }

    public static final List getUnfinishedWorkWithTag$lambda$0(String str, String str2, g85 g85Var) {
        g85Var.getClass();
        m85 s0 = g85Var.s0(str);
        try {
            s0.J(1, str2);
            ArrayList arrayList = new ArrayList();
            while (s0.p0()) {
                arrayList.add(s0.c0(0));
            }
            return arrayList;
        } finally {
            s0.close();
        }
    }

    public static final z77 getWorkSpec$lambda$0(String str, String str2, g85 g85Var) {
        boolean z;
        String c0;
        Integer valueOf;
        boolean z2;
        boolean z3;
        boolean z4;
        boolean z5;
        boolean z6;
        g85Var.getClass();
        m85 s0 = g85Var.s0(str);
        try {
            s0.J(1, str2);
            int K = t80.K(s0, "id");
            int K2 = t80.K(s0, "state");
            int K3 = t80.K(s0, "worker_class_name");
            int K4 = t80.K(s0, "input_merger_class_name");
            int K5 = t80.K(s0, "input");
            int K6 = t80.K(s0, "output");
            int K7 = t80.K(s0, "initial_delay");
            int K8 = t80.K(s0, "interval_duration");
            int K9 = t80.K(s0, "flex_duration");
            int K10 = t80.K(s0, "run_attempt_count");
            int K11 = t80.K(s0, "backoff_policy");
            int K12 = t80.K(s0, "backoff_delay_duration");
            int K13 = t80.K(s0, "last_enqueue_time");
            int K14 = t80.K(s0, "minimum_retention_duration");
            int K15 = t80.K(s0, "schedule_requested_at");
            int K16 = t80.K(s0, "run_in_foreground");
            int K17 = t80.K(s0, "out_of_quota_policy");
            int K18 = t80.K(s0, "period_count");
            int K19 = t80.K(s0, "generation");
            int K20 = t80.K(s0, "next_schedule_time_override");
            int K21 = t80.K(s0, "next_schedule_time_override_generation");
            int K22 = t80.K(s0, "stop_reason");
            int K23 = t80.K(s0, "trace_tag");
            int K24 = t80.K(s0, "backoff_on_system_interruptions");
            int K25 = t80.K(s0, "required_network_type");
            int K26 = t80.K(s0, "required_network_request");
            int K27 = t80.K(s0, "requires_charging");
            int K28 = t80.K(s0, "requires_device_idle");
            int K29 = t80.K(s0, "requires_battery_not_low");
            int K30 = t80.K(s0, "requires_storage_not_low");
            int K31 = t80.K(s0, "trigger_content_update_delay");
            int K32 = t80.K(s0, "trigger_max_content_delay");
            int K33 = t80.K(s0, "content_uri_triggers");
            z77 z77Var = null;
            Boolean bool = null;
            if (s0.p0()) {
                String c02 = s0.c0(K);
                j77 k = gy5.k((int) s0.getLong(K2));
                String c03 = s0.c0(K3);
                String c04 = s0.c0(K4);
                byte[] blob = s0.getBlob(K5);
                e41 e41Var = e41.b;
                e41 U = a34.U(blob);
                e41 U2 = a34.U(s0.getBlob(K6));
                long j = s0.getLong(K7);
                long j2 = s0.getLong(K8);
                long j3 = s0.getLong(K9);
                int i = (int) s0.getLong(K10);
                c00 h = gy5.h((int) s0.getLong(K11));
                long j4 = s0.getLong(K12);
                long j5 = s0.getLong(K13);
                long j6 = s0.getLong(K14);
                long j7 = s0.getLong(K15);
                if (((int) s0.getLong(K16)) != 0) {
                    z = true;
                } else {
                    z = false;
                }
                wg4 j8 = gy5.j((int) s0.getLong(K17));
                int i2 = (int) s0.getLong(K18);
                int i3 = (int) s0.getLong(K19);
                long j9 = s0.getLong(K20);
                int i4 = (int) s0.getLong(K21);
                int i5 = (int) s0.getLong(K22);
                if (s0.isNull(K23)) {
                    c0 = null;
                } else {
                    c0 = s0.c0(K23);
                }
                if (s0.isNull(K24)) {
                    valueOf = null;
                } else {
                    valueOf = Integer.valueOf((int) s0.getLong(K24));
                }
                if (valueOf != null) {
                    if (valueOf.intValue() != 0) {
                        z6 = true;
                    } else {
                        z6 = false;
                    }
                    bool = Boolean.valueOf(z6);
                }
                Boolean bool2 = bool;
                k94 i6 = gy5.i((int) s0.getLong(K25));
                f94 r = gy5.r(s0.getBlob(K26));
                if (((int) s0.getLong(K27)) != 0) {
                    z2 = true;
                } else {
                    z2 = false;
                }
                if (((int) s0.getLong(K28)) != 0) {
                    z3 = true;
                } else {
                    z3 = false;
                }
                if (((int) s0.getLong(K29)) != 0) {
                    z4 = true;
                } else {
                    z4 = false;
                }
                if (((int) s0.getLong(K30)) != 0) {
                    z5 = true;
                } else {
                    z5 = false;
                }
                z77Var = new z77(c02, k, c03, c04, U, U2, j, j2, j3, new qx0(r, i6, z2, z3, z4, z5, s0.getLong(K31), s0.getLong(K32), gy5.a(s0.getBlob(K33))), i, h, j4, j5, j6, j7, z, j8, i2, i3, j9, i4, i5, c0, bool2);
            }
            s0.close();
            return z77Var;
        } catch (Throwable th) {
            s0.close();
            throw th;
        }
    }

    /* JADX WARN: Type inference failed for: r2v0, types: [x77, java.lang.Object] */
    public static final List getWorkSpecIdAndStatesForName$lambda$0(String str, String str2, g85 g85Var) {
        g85Var.getClass();
        m85 s0 = g85Var.s0(str);
        try {
            s0.J(1, str2);
            ArrayList arrayList = new ArrayList();
            while (s0.p0()) {
                String c0 = s0.c0(0);
                j77 k = gy5.k((int) s0.getLong(1));
                c0.getClass();
                ?? obj = new Object();
                obj.a = c0;
                obj.b = k;
                arrayList.add(obj);
            }
            return arrayList;
        } finally {
            s0.close();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v1, types: [java.util.Map, so5, js] */
    /* JADX WARN: Type inference failed for: r6v1, types: [so5, js] */
    public static final List getWorkStatusPojoFlowDataForIds$lambda$0(String str, List list, WorkSpecDao_Impl workSpecDao_Impl, g85 g85Var) {
        boolean z;
        boolean z2;
        boolean z3;
        boolean z4;
        g85Var.getClass();
        m85 s0 = g85Var.s0(str);
        try {
            Iterator it = list.iterator();
            int i = 1;
            int i2 = 1;
            while (it.hasNext()) {
                s0.J(i2, (String) it.next());
                i2++;
            }
            int i3 = 0;
            ?? so5Var = new so5(0);
            ?? so5Var2 = new so5(0);
            while (s0.p0()) {
                String c0 = s0.c0(0);
                if (!so5Var.containsKey(c0)) {
                    so5Var.put(c0, new ArrayList());
                }
                String c02 = s0.c0(0);
                if (!so5Var2.containsKey(c02)) {
                    so5Var2.put(c02, new ArrayList());
                }
            }
            s0.reset();
            workSpecDao_Impl.__fetchRelationshipWorkTagAsjavaLangString(g85Var, so5Var);
            workSpecDao_Impl.__fetchRelationshipWorkProgressAsandroidxWorkData(g85Var, so5Var2);
            ArrayList arrayList = new ArrayList();
            Map map = so5Var2;
            while (s0.p0()) {
                String c03 = s0.c0(i3);
                j77 k = gy5.k((int) s0.getLong(i));
                byte[] blob = s0.getBlob(2);
                e41 e41Var = e41.b;
                e41 U = a34.U(blob);
                int i4 = (int) s0.getLong(3);
                int i5 = (int) s0.getLong(4);
                long j = s0.getLong(14);
                long j2 = s0.getLong(15);
                long j3 = s0.getLong(16);
                Map map2 = map;
                c00 h = gy5.h((int) s0.getLong(17));
                long j4 = s0.getLong(18);
                long j5 = s0.getLong(19);
                int i6 = (int) s0.getLong(20);
                long j6 = s0.getLong(21);
                int i7 = (int) s0.getLong(22);
                String c04 = s0.c0(23);
                k94 i8 = gy5.i((int) s0.getLong(5));
                f94 r = gy5.r(s0.getBlob(6));
                if (((int) s0.getLong(7)) != 0) {
                    z = true;
                } else {
                    z = false;
                }
                if (((int) s0.getLong(8)) != 0) {
                    z2 = true;
                } else {
                    z2 = false;
                }
                if (((int) s0.getLong(9)) != 0) {
                    z3 = true;
                } else {
                    z3 = false;
                }
                if (((int) s0.getLong(10)) != 0) {
                    z4 = true;
                } else {
                    z4 = false;
                }
                qx0 qx0Var = new qx0(r, i8, z, z2, z3, z4, s0.getLong(11), s0.getLong(12), gy5.a(s0.getBlob(13)));
                Object Q = vn3.Q(s0.c0(0), so5Var);
                Q.getClass();
                List list2 = (List) Q;
                Map map3 = map2;
                Object Q2 = vn3.Q(s0.c0(0), map3);
                Q2.getClass();
                arrayList.add(new y77(c03, k, U, j, j2, j3, qx0Var, i4, h, j4, j5, i6, i5, j6, i7, list2, c04, (List) Q2));
                i3 = 0;
                i = 1;
                map = map3;
            }
            s0.close();
            return arrayList;
        } catch (Throwable th) {
            s0.close();
            throw th;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v1, types: [java.util.Map, so5, js] */
    /* JADX WARN: Type inference failed for: r6v0, types: [so5, js] */
    public static final List getWorkStatusPojoFlowForName$lambda$0(String str, String str2, WorkSpecDao_Impl workSpecDao_Impl, g85 g85Var) {
        boolean z;
        boolean z2;
        boolean z3;
        boolean z4;
        g85Var.getClass();
        m85 s0 = g85Var.s0(str);
        int i = 1;
        try {
            s0.J(1, str2);
            int i2 = 0;
            ?? so5Var = new so5(0);
            ?? so5Var2 = new so5(0);
            while (s0.p0()) {
                String c0 = s0.c0(0);
                if (!so5Var.containsKey(c0)) {
                    so5Var.put(c0, new ArrayList());
                }
                String c02 = s0.c0(0);
                if (!so5Var2.containsKey(c02)) {
                    so5Var2.put(c02, new ArrayList());
                }
            }
            s0.reset();
            workSpecDao_Impl.__fetchRelationshipWorkTagAsjavaLangString(g85Var, so5Var);
            workSpecDao_Impl.__fetchRelationshipWorkProgressAsandroidxWorkData(g85Var, so5Var2);
            ArrayList arrayList = new ArrayList();
            Map map = so5Var2;
            while (s0.p0()) {
                String c03 = s0.c0(i2);
                j77 k = gy5.k((int) s0.getLong(i));
                byte[] blob = s0.getBlob(2);
                e41 e41Var = e41.b;
                e41 U = a34.U(blob);
                int i3 = (int) s0.getLong(3);
                int i4 = (int) s0.getLong(4);
                long j = s0.getLong(14);
                long j2 = s0.getLong(15);
                long j3 = s0.getLong(16);
                Map map2 = map;
                c00 h = gy5.h((int) s0.getLong(17));
                long j4 = s0.getLong(18);
                long j5 = s0.getLong(19);
                int i5 = (int) s0.getLong(20);
                long j6 = s0.getLong(21);
                int i6 = (int) s0.getLong(22);
                String c04 = s0.c0(23);
                k94 i7 = gy5.i((int) s0.getLong(5));
                f94 r = gy5.r(s0.getBlob(6));
                if (((int) s0.getLong(7)) != 0) {
                    z = true;
                } else {
                    z = false;
                }
                if (((int) s0.getLong(8)) != 0) {
                    z2 = true;
                } else {
                    z2 = false;
                }
                if (((int) s0.getLong(9)) != 0) {
                    z3 = true;
                } else {
                    z3 = false;
                }
                if (((int) s0.getLong(10)) != 0) {
                    z4 = true;
                } else {
                    z4 = false;
                }
                qx0 qx0Var = new qx0(r, i7, z, z2, z3, z4, s0.getLong(11), s0.getLong(12), gy5.a(s0.getBlob(13)));
                Object Q = vn3.Q(s0.c0(0), so5Var);
                Q.getClass();
                List list = (List) Q;
                Object Q2 = vn3.Q(s0.c0(0), map2);
                Q2.getClass();
                arrayList.add(new y77(c03, k, U, j, j2, j3, qx0Var, i3, h, j4, j5, i5, i4, j6, i6, list, c04, (List) Q2));
                map = map2;
                i = 1;
                i2 = 0;
            }
            s0.close();
            return arrayList;
        } catch (Throwable th) {
            s0.close();
            throw th;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v1, types: [java.util.Map, so5, js] */
    /* JADX WARN: Type inference failed for: r6v0, types: [so5, js] */
    public static final List getWorkStatusPojoFlowForTag$lambda$0(String str, String str2, WorkSpecDao_Impl workSpecDao_Impl, g85 g85Var) {
        boolean z;
        boolean z2;
        boolean z3;
        boolean z4;
        g85Var.getClass();
        m85 s0 = g85Var.s0(str);
        int i = 1;
        try {
            s0.J(1, str2);
            int i2 = 0;
            ?? so5Var = new so5(0);
            ?? so5Var2 = new so5(0);
            while (s0.p0()) {
                String c0 = s0.c0(0);
                if (!so5Var.containsKey(c0)) {
                    so5Var.put(c0, new ArrayList());
                }
                String c02 = s0.c0(0);
                if (!so5Var2.containsKey(c02)) {
                    so5Var2.put(c02, new ArrayList());
                }
            }
            s0.reset();
            workSpecDao_Impl.__fetchRelationshipWorkTagAsjavaLangString(g85Var, so5Var);
            workSpecDao_Impl.__fetchRelationshipWorkProgressAsandroidxWorkData(g85Var, so5Var2);
            ArrayList arrayList = new ArrayList();
            Map map = so5Var2;
            while (s0.p0()) {
                String c03 = s0.c0(i2);
                j77 k = gy5.k((int) s0.getLong(i));
                byte[] blob = s0.getBlob(2);
                e41 e41Var = e41.b;
                e41 U = a34.U(blob);
                int i3 = (int) s0.getLong(3);
                int i4 = (int) s0.getLong(4);
                long j = s0.getLong(14);
                long j2 = s0.getLong(15);
                long j3 = s0.getLong(16);
                Map map2 = map;
                c00 h = gy5.h((int) s0.getLong(17));
                long j4 = s0.getLong(18);
                long j5 = s0.getLong(19);
                int i5 = (int) s0.getLong(20);
                long j6 = s0.getLong(21);
                int i6 = (int) s0.getLong(22);
                String c04 = s0.c0(23);
                k94 i7 = gy5.i((int) s0.getLong(5));
                f94 r = gy5.r(s0.getBlob(6));
                if (((int) s0.getLong(7)) != 0) {
                    z = true;
                } else {
                    z = false;
                }
                if (((int) s0.getLong(8)) != 0) {
                    z2 = true;
                } else {
                    z2 = false;
                }
                if (((int) s0.getLong(9)) != 0) {
                    z3 = true;
                } else {
                    z3 = false;
                }
                if (((int) s0.getLong(10)) != 0) {
                    z4 = true;
                } else {
                    z4 = false;
                }
                qx0 qx0Var = new qx0(r, i7, z, z2, z3, z4, s0.getLong(11), s0.getLong(12), gy5.a(s0.getBlob(13)));
                Object Q = vn3.Q(s0.c0(0), so5Var);
                Q.getClass();
                List list = (List) Q;
                Object Q2 = vn3.Q(s0.c0(0), map2);
                Q2.getClass();
                arrayList.add(new y77(c03, k, U, j, j2, j3, qx0Var, i3, h, j4, j5, i5, i4, j6, i6, list, c04, (List) Q2));
                map = map2;
                i = 1;
                i2 = 0;
            }
            s0.close();
            return arrayList;
        } catch (Throwable th) {
            s0.close();
            throw th;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v1, types: [java.util.Map, so5, js] */
    /* JADX WARN: Type inference failed for: r6v0, types: [java.util.Map, so5, js] */
    public static final y77 getWorkStatusPojoForId$lambda$0(String str, String str2, WorkSpecDao_Impl workSpecDao_Impl, g85 g85Var) {
        y77 y77Var;
        boolean z;
        boolean z2;
        boolean z3;
        boolean z4;
        g85Var.getClass();
        m85 s0 = g85Var.s0(str);
        try {
            s0.J(1, str2);
            ?? so5Var = new so5(0);
            ?? so5Var2 = new so5(0);
            while (s0.p0()) {
                String c0 = s0.c0(0);
                if (!so5Var.containsKey(c0)) {
                    so5Var.put(c0, new ArrayList());
                }
                String c02 = s0.c0(0);
                if (!so5Var2.containsKey(c02)) {
                    so5Var2.put(c02, new ArrayList());
                }
            }
            s0.reset();
            workSpecDao_Impl.__fetchRelationshipWorkTagAsjavaLangString(g85Var, so5Var);
            workSpecDao_Impl.__fetchRelationshipWorkProgressAsandroidxWorkData(g85Var, so5Var2);
            if (s0.p0()) {
                String c03 = s0.c0(0);
                j77 k = gy5.k((int) s0.getLong(1));
                byte[] blob = s0.getBlob(2);
                e41 e41Var = e41.b;
                e41 U = a34.U(blob);
                int i = (int) s0.getLong(3);
                int i2 = (int) s0.getLong(4);
                long j = s0.getLong(14);
                long j2 = s0.getLong(15);
                long j3 = s0.getLong(16);
                c00 h = gy5.h((int) s0.getLong(17));
                long j4 = s0.getLong(18);
                long j5 = s0.getLong(19);
                int i3 = (int) s0.getLong(20);
                long j6 = s0.getLong(21);
                int i4 = (int) s0.getLong(22);
                String c04 = s0.c0(23);
                k94 i5 = gy5.i((int) s0.getLong(5));
                f94 r = gy5.r(s0.getBlob(6));
                if (((int) s0.getLong(7)) != 0) {
                    z = true;
                } else {
                    z = false;
                }
                if (((int) s0.getLong(8)) != 0) {
                    z2 = true;
                } else {
                    z2 = false;
                }
                if (((int) s0.getLong(9)) != 0) {
                    z3 = true;
                } else {
                    z3 = false;
                }
                if (((int) s0.getLong(10)) != 0) {
                    z4 = true;
                } else {
                    z4 = false;
                }
                qx0 qx0Var = new qx0(r, i5, z, z2, z3, z4, s0.getLong(11), s0.getLong(12), gy5.a(s0.getBlob(13)));
                Object Q = vn3.Q(s0.c0(0), so5Var);
                Q.getClass();
                List list = (List) Q;
                Object Q2 = vn3.Q(s0.c0(0), so5Var2);
                Q2.getClass();
                y77Var = new y77(c03, k, U, j, j2, j3, qx0Var, i, h, j4, j5, i3, i2, j6, i4, list, c04, (List) Q2);
            } else {
                y77Var = null;
            }
            s0.close();
            return y77Var;
        } catch (Throwable th) {
            s0.close();
            throw th;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v1, types: [java.util.Map, so5, js] */
    /* JADX WARN: Type inference failed for: r6v1, types: [so5, js] */
    public static final List getWorkStatusPojoForIds$lambda$0(String str, List list, WorkSpecDao_Impl workSpecDao_Impl, g85 g85Var) {
        boolean z;
        boolean z2;
        boolean z3;
        boolean z4;
        g85Var.getClass();
        m85 s0 = g85Var.s0(str);
        try {
            Iterator it = list.iterator();
            int i = 1;
            int i2 = 1;
            while (it.hasNext()) {
                s0.J(i2, (String) it.next());
                i2++;
            }
            int i3 = 0;
            ?? so5Var = new so5(0);
            ?? so5Var2 = new so5(0);
            while (s0.p0()) {
                String c0 = s0.c0(0);
                if (!so5Var.containsKey(c0)) {
                    so5Var.put(c0, new ArrayList());
                }
                String c02 = s0.c0(0);
                if (!so5Var2.containsKey(c02)) {
                    so5Var2.put(c02, new ArrayList());
                }
            }
            s0.reset();
            workSpecDao_Impl.__fetchRelationshipWorkTagAsjavaLangString(g85Var, so5Var);
            workSpecDao_Impl.__fetchRelationshipWorkProgressAsandroidxWorkData(g85Var, so5Var2);
            ArrayList arrayList = new ArrayList();
            Map map = so5Var2;
            while (s0.p0()) {
                String c03 = s0.c0(i3);
                j77 k = gy5.k((int) s0.getLong(i));
                byte[] blob = s0.getBlob(2);
                e41 e41Var = e41.b;
                e41 U = a34.U(blob);
                int i4 = (int) s0.getLong(3);
                int i5 = (int) s0.getLong(4);
                long j = s0.getLong(14);
                long j2 = s0.getLong(15);
                long j3 = s0.getLong(16);
                Map map2 = map;
                c00 h = gy5.h((int) s0.getLong(17));
                long j4 = s0.getLong(18);
                long j5 = s0.getLong(19);
                int i6 = (int) s0.getLong(20);
                long j6 = s0.getLong(21);
                int i7 = (int) s0.getLong(22);
                String c04 = s0.c0(23);
                k94 i8 = gy5.i((int) s0.getLong(5));
                f94 r = gy5.r(s0.getBlob(6));
                if (((int) s0.getLong(7)) != 0) {
                    z = true;
                } else {
                    z = false;
                }
                if (((int) s0.getLong(8)) != 0) {
                    z2 = true;
                } else {
                    z2 = false;
                }
                if (((int) s0.getLong(9)) != 0) {
                    z3 = true;
                } else {
                    z3 = false;
                }
                if (((int) s0.getLong(10)) != 0) {
                    z4 = true;
                } else {
                    z4 = false;
                }
                qx0 qx0Var = new qx0(r, i8, z, z2, z3, z4, s0.getLong(11), s0.getLong(12), gy5.a(s0.getBlob(13)));
                Object Q = vn3.Q(s0.c0(0), so5Var);
                Q.getClass();
                List list2 = (List) Q;
                Map map3 = map2;
                Object Q2 = vn3.Q(s0.c0(0), map3);
                Q2.getClass();
                arrayList.add(new y77(c03, k, U, j, j2, j3, qx0Var, i4, h, j4, j5, i6, i5, j6, i7, list2, c04, (List) Q2));
                i3 = 0;
                i = 1;
                map = map3;
            }
            s0.close();
            return arrayList;
        } catch (Throwable th) {
            s0.close();
            throw th;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v1, types: [java.util.Map, so5, js] */
    /* JADX WARN: Type inference failed for: r6v0, types: [so5, js] */
    public static final List getWorkStatusPojoForName$lambda$0(String str, String str2, WorkSpecDao_Impl workSpecDao_Impl, g85 g85Var) {
        boolean z;
        boolean z2;
        boolean z3;
        boolean z4;
        g85Var.getClass();
        m85 s0 = g85Var.s0(str);
        int i = 1;
        try {
            s0.J(1, str2);
            int i2 = 0;
            ?? so5Var = new so5(0);
            ?? so5Var2 = new so5(0);
            while (s0.p0()) {
                String c0 = s0.c0(0);
                if (!so5Var.containsKey(c0)) {
                    so5Var.put(c0, new ArrayList());
                }
                String c02 = s0.c0(0);
                if (!so5Var2.containsKey(c02)) {
                    so5Var2.put(c02, new ArrayList());
                }
            }
            s0.reset();
            workSpecDao_Impl.__fetchRelationshipWorkTagAsjavaLangString(g85Var, so5Var);
            workSpecDao_Impl.__fetchRelationshipWorkProgressAsandroidxWorkData(g85Var, so5Var2);
            ArrayList arrayList = new ArrayList();
            Map map = so5Var2;
            while (s0.p0()) {
                String c03 = s0.c0(i2);
                j77 k = gy5.k((int) s0.getLong(i));
                byte[] blob = s0.getBlob(2);
                e41 e41Var = e41.b;
                e41 U = a34.U(blob);
                int i3 = (int) s0.getLong(3);
                int i4 = (int) s0.getLong(4);
                long j = s0.getLong(14);
                long j2 = s0.getLong(15);
                long j3 = s0.getLong(16);
                Map map2 = map;
                c00 h = gy5.h((int) s0.getLong(17));
                long j4 = s0.getLong(18);
                long j5 = s0.getLong(19);
                int i5 = (int) s0.getLong(20);
                long j6 = s0.getLong(21);
                int i6 = (int) s0.getLong(22);
                String c04 = s0.c0(23);
                k94 i7 = gy5.i((int) s0.getLong(5));
                f94 r = gy5.r(s0.getBlob(6));
                if (((int) s0.getLong(7)) != 0) {
                    z = true;
                } else {
                    z = false;
                }
                if (((int) s0.getLong(8)) != 0) {
                    z2 = true;
                } else {
                    z2 = false;
                }
                if (((int) s0.getLong(9)) != 0) {
                    z3 = true;
                } else {
                    z3 = false;
                }
                if (((int) s0.getLong(10)) != 0) {
                    z4 = true;
                } else {
                    z4 = false;
                }
                qx0 qx0Var = new qx0(r, i7, z, z2, z3, z4, s0.getLong(11), s0.getLong(12), gy5.a(s0.getBlob(13)));
                Object Q = vn3.Q(s0.c0(0), so5Var);
                Q.getClass();
                List list = (List) Q;
                Object Q2 = vn3.Q(s0.c0(0), map2);
                Q2.getClass();
                arrayList.add(new y77(c03, k, U, j, j2, j3, qx0Var, i3, h, j4, j5, i5, i4, j6, i6, list, c04, (List) Q2));
                map = map2;
                i = 1;
                i2 = 0;
            }
            s0.close();
            return arrayList;
        } catch (Throwable th) {
            s0.close();
            throw th;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v1, types: [java.util.Map, so5, js] */
    /* JADX WARN: Type inference failed for: r6v0, types: [so5, js] */
    public static final List getWorkStatusPojoForTag$lambda$0(String str, String str2, WorkSpecDao_Impl workSpecDao_Impl, g85 g85Var) {
        boolean z;
        boolean z2;
        boolean z3;
        boolean z4;
        g85Var.getClass();
        m85 s0 = g85Var.s0(str);
        int i = 1;
        try {
            s0.J(1, str2);
            int i2 = 0;
            ?? so5Var = new so5(0);
            ?? so5Var2 = new so5(0);
            while (s0.p0()) {
                String c0 = s0.c0(0);
                if (!so5Var.containsKey(c0)) {
                    so5Var.put(c0, new ArrayList());
                }
                String c02 = s0.c0(0);
                if (!so5Var2.containsKey(c02)) {
                    so5Var2.put(c02, new ArrayList());
                }
            }
            s0.reset();
            workSpecDao_Impl.__fetchRelationshipWorkTagAsjavaLangString(g85Var, so5Var);
            workSpecDao_Impl.__fetchRelationshipWorkProgressAsandroidxWorkData(g85Var, so5Var2);
            ArrayList arrayList = new ArrayList();
            Map map = so5Var2;
            while (s0.p0()) {
                String c03 = s0.c0(i2);
                j77 k = gy5.k((int) s0.getLong(i));
                byte[] blob = s0.getBlob(2);
                e41 e41Var = e41.b;
                e41 U = a34.U(blob);
                int i3 = (int) s0.getLong(3);
                int i4 = (int) s0.getLong(4);
                long j = s0.getLong(14);
                long j2 = s0.getLong(15);
                long j3 = s0.getLong(16);
                Map map2 = map;
                c00 h = gy5.h((int) s0.getLong(17));
                long j4 = s0.getLong(18);
                long j5 = s0.getLong(19);
                int i5 = (int) s0.getLong(20);
                long j6 = s0.getLong(21);
                int i6 = (int) s0.getLong(22);
                String c04 = s0.c0(23);
                k94 i7 = gy5.i((int) s0.getLong(5));
                f94 r = gy5.r(s0.getBlob(6));
                if (((int) s0.getLong(7)) != 0) {
                    z = true;
                } else {
                    z = false;
                }
                if (((int) s0.getLong(8)) != 0) {
                    z2 = true;
                } else {
                    z2 = false;
                }
                if (((int) s0.getLong(9)) != 0) {
                    z3 = true;
                } else {
                    z3 = false;
                }
                if (((int) s0.getLong(10)) != 0) {
                    z4 = true;
                } else {
                    z4 = false;
                }
                qx0 qx0Var = new qx0(r, i7, z, z2, z3, z4, s0.getLong(11), s0.getLong(12), gy5.a(s0.getBlob(13)));
                Object Q = vn3.Q(s0.c0(0), so5Var);
                Q.getClass();
                List list = (List) Q;
                Object Q2 = vn3.Q(s0.c0(0), map2);
                Q2.getClass();
                arrayList.add(new y77(c03, k, U, j, j2, j3, qx0Var, i3, h, j4, j5, i5, i4, j6, i6, list, c04, (List) Q2));
                map = map2;
                i = 1;
                i2 = 0;
            }
            s0.close();
            return arrayList;
        } catch (Throwable th) {
            s0.close();
            throw th;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v1, types: [java.util.Map, so5, js] */
    /* JADX WARN: Type inference failed for: r6v1, types: [so5, js] */
    public static final List getWorkStatusPojoLiveDataForIds$lambda$0(String str, List list, WorkSpecDao_Impl workSpecDao_Impl, g85 g85Var) {
        boolean z;
        boolean z2;
        boolean z3;
        boolean z4;
        g85Var.getClass();
        m85 s0 = g85Var.s0(str);
        try {
            Iterator it = list.iterator();
            int i = 1;
            int i2 = 1;
            while (it.hasNext()) {
                s0.J(i2, (String) it.next());
                i2++;
            }
            int i3 = 0;
            ?? so5Var = new so5(0);
            ?? so5Var2 = new so5(0);
            while (s0.p0()) {
                String c0 = s0.c0(0);
                if (!so5Var.containsKey(c0)) {
                    so5Var.put(c0, new ArrayList());
                }
                String c02 = s0.c0(0);
                if (!so5Var2.containsKey(c02)) {
                    so5Var2.put(c02, new ArrayList());
                }
            }
            s0.reset();
            workSpecDao_Impl.__fetchRelationshipWorkTagAsjavaLangString(g85Var, so5Var);
            workSpecDao_Impl.__fetchRelationshipWorkProgressAsandroidxWorkData(g85Var, so5Var2);
            ArrayList arrayList = new ArrayList();
            Map map = so5Var2;
            while (s0.p0()) {
                String c03 = s0.c0(i3);
                j77 k = gy5.k((int) s0.getLong(i));
                byte[] blob = s0.getBlob(2);
                e41 e41Var = e41.b;
                e41 U = a34.U(blob);
                int i4 = (int) s0.getLong(3);
                int i5 = (int) s0.getLong(4);
                long j = s0.getLong(14);
                long j2 = s0.getLong(15);
                long j3 = s0.getLong(16);
                Map map2 = map;
                c00 h = gy5.h((int) s0.getLong(17));
                long j4 = s0.getLong(18);
                long j5 = s0.getLong(19);
                int i6 = (int) s0.getLong(20);
                long j6 = s0.getLong(21);
                int i7 = (int) s0.getLong(22);
                String c04 = s0.c0(23);
                k94 i8 = gy5.i((int) s0.getLong(5));
                f94 r = gy5.r(s0.getBlob(6));
                if (((int) s0.getLong(7)) != 0) {
                    z = true;
                } else {
                    z = false;
                }
                if (((int) s0.getLong(8)) != 0) {
                    z2 = true;
                } else {
                    z2 = false;
                }
                if (((int) s0.getLong(9)) != 0) {
                    z3 = true;
                } else {
                    z3 = false;
                }
                if (((int) s0.getLong(10)) != 0) {
                    z4 = true;
                } else {
                    z4 = false;
                }
                qx0 qx0Var = new qx0(r, i8, z, z2, z3, z4, s0.getLong(11), s0.getLong(12), gy5.a(s0.getBlob(13)));
                Object Q = vn3.Q(s0.c0(0), so5Var);
                Q.getClass();
                List list2 = (List) Q;
                Map map3 = map2;
                Object Q2 = vn3.Q(s0.c0(0), map3);
                Q2.getClass();
                arrayList.add(new y77(c03, k, U, j, j2, j3, qx0Var, i4, h, j4, j5, i6, i5, j6, i7, list2, c04, (List) Q2));
                i3 = 0;
                i = 1;
                map = map3;
            }
            s0.close();
            return arrayList;
        } catch (Throwable th) {
            s0.close();
            throw th;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v1, types: [java.util.Map, so5, js] */
    /* JADX WARN: Type inference failed for: r6v0, types: [so5, js] */
    public static final List getWorkStatusPojoLiveDataForName$lambda$0(String str, String str2, WorkSpecDao_Impl workSpecDao_Impl, g85 g85Var) {
        boolean z;
        boolean z2;
        boolean z3;
        boolean z4;
        g85Var.getClass();
        m85 s0 = g85Var.s0(str);
        int i = 1;
        try {
            s0.J(1, str2);
            int i2 = 0;
            ?? so5Var = new so5(0);
            ?? so5Var2 = new so5(0);
            while (s0.p0()) {
                String c0 = s0.c0(0);
                if (!so5Var.containsKey(c0)) {
                    so5Var.put(c0, new ArrayList());
                }
                String c02 = s0.c0(0);
                if (!so5Var2.containsKey(c02)) {
                    so5Var2.put(c02, new ArrayList());
                }
            }
            s0.reset();
            workSpecDao_Impl.__fetchRelationshipWorkTagAsjavaLangString(g85Var, so5Var);
            workSpecDao_Impl.__fetchRelationshipWorkProgressAsandroidxWorkData(g85Var, so5Var2);
            ArrayList arrayList = new ArrayList();
            Map map = so5Var2;
            while (s0.p0()) {
                String c03 = s0.c0(i2);
                j77 k = gy5.k((int) s0.getLong(i));
                byte[] blob = s0.getBlob(2);
                e41 e41Var = e41.b;
                e41 U = a34.U(blob);
                int i3 = (int) s0.getLong(3);
                int i4 = (int) s0.getLong(4);
                long j = s0.getLong(14);
                long j2 = s0.getLong(15);
                long j3 = s0.getLong(16);
                Map map2 = map;
                c00 h = gy5.h((int) s0.getLong(17));
                long j4 = s0.getLong(18);
                long j5 = s0.getLong(19);
                int i5 = (int) s0.getLong(20);
                long j6 = s0.getLong(21);
                int i6 = (int) s0.getLong(22);
                String c04 = s0.c0(23);
                k94 i7 = gy5.i((int) s0.getLong(5));
                f94 r = gy5.r(s0.getBlob(6));
                if (((int) s0.getLong(7)) != 0) {
                    z = true;
                } else {
                    z = false;
                }
                if (((int) s0.getLong(8)) != 0) {
                    z2 = true;
                } else {
                    z2 = false;
                }
                if (((int) s0.getLong(9)) != 0) {
                    z3 = true;
                } else {
                    z3 = false;
                }
                if (((int) s0.getLong(10)) != 0) {
                    z4 = true;
                } else {
                    z4 = false;
                }
                qx0 qx0Var = new qx0(r, i7, z, z2, z3, z4, s0.getLong(11), s0.getLong(12), gy5.a(s0.getBlob(13)));
                Object Q = vn3.Q(s0.c0(0), so5Var);
                Q.getClass();
                List list = (List) Q;
                Object Q2 = vn3.Q(s0.c0(0), map2);
                Q2.getClass();
                arrayList.add(new y77(c03, k, U, j, j2, j3, qx0Var, i3, h, j4, j5, i5, i4, j6, i6, list, c04, (List) Q2));
                map = map2;
                i = 1;
                i2 = 0;
            }
            s0.close();
            return arrayList;
        } catch (Throwable th) {
            s0.close();
            throw th;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v1, types: [java.util.Map, so5, js] */
    /* JADX WARN: Type inference failed for: r6v0, types: [so5, js] */
    public static final List getWorkStatusPojoLiveDataForTag$lambda$0(String str, String str2, WorkSpecDao_Impl workSpecDao_Impl, g85 g85Var) {
        boolean z;
        boolean z2;
        boolean z3;
        boolean z4;
        g85Var.getClass();
        m85 s0 = g85Var.s0(str);
        int i = 1;
        try {
            s0.J(1, str2);
            int i2 = 0;
            ?? so5Var = new so5(0);
            ?? so5Var2 = new so5(0);
            while (s0.p0()) {
                String c0 = s0.c0(0);
                if (!so5Var.containsKey(c0)) {
                    so5Var.put(c0, new ArrayList());
                }
                String c02 = s0.c0(0);
                if (!so5Var2.containsKey(c02)) {
                    so5Var2.put(c02, new ArrayList());
                }
            }
            s0.reset();
            workSpecDao_Impl.__fetchRelationshipWorkTagAsjavaLangString(g85Var, so5Var);
            workSpecDao_Impl.__fetchRelationshipWorkProgressAsandroidxWorkData(g85Var, so5Var2);
            ArrayList arrayList = new ArrayList();
            Map map = so5Var2;
            while (s0.p0()) {
                String c03 = s0.c0(i2);
                j77 k = gy5.k((int) s0.getLong(i));
                byte[] blob = s0.getBlob(2);
                e41 e41Var = e41.b;
                e41 U = a34.U(blob);
                int i3 = (int) s0.getLong(3);
                int i4 = (int) s0.getLong(4);
                long j = s0.getLong(14);
                long j2 = s0.getLong(15);
                long j3 = s0.getLong(16);
                Map map2 = map;
                c00 h = gy5.h((int) s0.getLong(17));
                long j4 = s0.getLong(18);
                long j5 = s0.getLong(19);
                int i5 = (int) s0.getLong(20);
                long j6 = s0.getLong(21);
                int i6 = (int) s0.getLong(22);
                String c04 = s0.c0(23);
                k94 i7 = gy5.i((int) s0.getLong(5));
                f94 r = gy5.r(s0.getBlob(6));
                if (((int) s0.getLong(7)) != 0) {
                    z = true;
                } else {
                    z = false;
                }
                if (((int) s0.getLong(8)) != 0) {
                    z2 = true;
                } else {
                    z2 = false;
                }
                if (((int) s0.getLong(9)) != 0) {
                    z3 = true;
                } else {
                    z3 = false;
                }
                if (((int) s0.getLong(10)) != 0) {
                    z4 = true;
                } else {
                    z4 = false;
                }
                qx0 qx0Var = new qx0(r, i7, z, z2, z3, z4, s0.getLong(11), s0.getLong(12), gy5.a(s0.getBlob(13)));
                Object Q = vn3.Q(s0.c0(0), so5Var);
                Q.getClass();
                List list = (List) Q;
                Object Q2 = vn3.Q(s0.c0(0), map2);
                Q2.getClass();
                arrayList.add(new y77(c03, k, U, j, j2, j3, qx0Var, i3, h, j4, j5, i5, i4, j6, i6, list, c04, (List) Q2));
                map = map2;
                i = 1;
                i2 = 0;
            }
            s0.close();
            return arrayList;
        } catch (Throwable th) {
            s0.close();
            throw th;
        }
    }

    public static final boolean hasUnfinishedWorkFlow$lambda$0(String str, g85 g85Var) {
        g85Var.getClass();
        m85 s0 = g85Var.s0(str);
        try {
            boolean z = false;
            if (s0.p0()) {
                if (((int) s0.getLong(0)) != 0) {
                    z = true;
                }
            }
            return z;
        } finally {
            s0.close();
        }
    }

    public static final pn6 incrementGeneration$lambda$0(String str, String str2, g85 g85Var) {
        g85Var.getClass();
        m85 s0 = g85Var.s0(str);
        try {
            s0.J(1, str2);
            s0.p0();
            s0.close();
            return pn6.a;
        } catch (Throwable th) {
            s0.close();
            throw th;
        }
    }

    public static final pn6 incrementPeriodCount$lambda$0(String str, String str2, g85 g85Var) {
        g85Var.getClass();
        m85 s0 = g85Var.s0(str);
        try {
            s0.J(1, str2);
            s0.p0();
            s0.close();
            return pn6.a;
        } catch (Throwable th) {
            s0.close();
            throw th;
        }
    }

    public static final int incrementWorkSpecRunAttemptCount$lambda$0(String str, String str2, g85 g85Var) {
        g85Var.getClass();
        m85 s0 = g85Var.s0(str);
        try {
            s0.J(1, str2);
            s0.p0();
            return o80.y(g85Var);
        } finally {
            s0.close();
        }
    }

    public static final pn6 insertWorkSpec$lambda$0(WorkSpecDao_Impl workSpecDao_Impl, z77 z77Var, g85 g85Var) {
        g85Var.getClass();
        workSpecDao_Impl.__insertAdapterOfWorkSpec.insert(g85Var, z77Var);
        return pn6.a;
    }

    public static final boolean isWorkSpecScheduled$lambda$0(String str, String str2, g85 g85Var) {
        g85Var.getClass();
        m85 s0 = g85Var.s0(str);
        boolean z = true;
        try {
            s0.J(1, str2);
            boolean z2 = false;
            if (s0.p0()) {
                if (((int) s0.getLong(0)) == 0) {
                    z = false;
                }
                z2 = z;
            }
            return z2;
        } finally {
            s0.close();
        }
    }

    public static final int markWorkSpecScheduled$lambda$0(String str, long j, String str2, g85 g85Var) {
        g85Var.getClass();
        m85 s0 = g85Var.s0(str);
        try {
            s0.e(1, j);
            s0.J(2, str2);
            s0.p0();
            return o80.y(g85Var);
        } finally {
            s0.close();
        }
    }

    public static final pn6 pruneFinishedWorkWithZeroDependentsIgnoringKeepForAtLeast$lambda$0(String str, g85 g85Var) {
        g85Var.getClass();
        m85 s0 = g85Var.s0(str);
        try {
            s0.p0();
            s0.close();
            return pn6.a;
        } catch (Throwable th) {
            s0.close();
            throw th;
        }
    }

    public static final int resetScheduledState$lambda$0(String str, g85 g85Var) {
        g85Var.getClass();
        m85 s0 = g85Var.s0(str);
        try {
            s0.p0();
            return o80.y(g85Var);
        } finally {
            s0.close();
        }
    }

    public static final pn6 resetWorkSpecNextScheduleTimeOverride$lambda$0(String str, String str2, int i, g85 g85Var) {
        g85Var.getClass();
        m85 s0 = g85Var.s0(str);
        try {
            s0.J(1, str2);
            s0.e(2, i);
            s0.p0();
            s0.close();
            return pn6.a;
        } catch (Throwable th) {
            s0.close();
            throw th;
        }
    }

    public static final int resetWorkSpecRunAttemptCount$lambda$0(String str, String str2, g85 g85Var) {
        g85Var.getClass();
        m85 s0 = g85Var.s0(str);
        try {
            s0.J(1, str2);
            s0.p0();
            return o80.y(g85Var);
        } finally {
            s0.close();
        }
    }

    public static final int setCancelledState$lambda$0(String str, String str2, g85 g85Var) {
        g85Var.getClass();
        m85 s0 = g85Var.s0(str);
        try {
            s0.J(1, str2);
            s0.p0();
            return o80.y(g85Var);
        } finally {
            s0.close();
        }
    }

    public static final pn6 setLastEnqueueTime$lambda$0(String str, long j, String str2, g85 g85Var) {
        g85Var.getClass();
        m85 s0 = g85Var.s0(str);
        try {
            s0.e(1, j);
            s0.J(2, str2);
            s0.p0();
            s0.close();
            return pn6.a;
        } catch (Throwable th) {
            s0.close();
            throw th;
        }
    }

    public static final pn6 setNextScheduleTimeOverride$lambda$0(String str, long j, String str2, g85 g85Var) {
        g85Var.getClass();
        m85 s0 = g85Var.s0(str);
        try {
            s0.e(1, j);
            s0.J(2, str2);
            s0.p0();
            s0.close();
            return pn6.a;
        } catch (Throwable th) {
            s0.close();
            throw th;
        }
    }

    public static final pn6 setOutput$lambda$0(String str, e41 e41Var, String str2, g85 g85Var) {
        g85Var.getClass();
        m85 s0 = g85Var.s0(str);
        try {
            e41 e41Var2 = e41.b;
            s0.f(1, a34.t0(e41Var));
            s0.J(2, str2);
            s0.p0();
            s0.close();
            return pn6.a;
        } catch (Throwable th) {
            s0.close();
            throw th;
        }
    }

    public static final int setState$lambda$0(String str, j77 j77Var, String str2, g85 g85Var) {
        g85Var.getClass();
        m85 s0 = g85Var.s0(str);
        try {
            s0.e(1, gy5.q(j77Var));
            s0.J(2, str2);
            s0.p0();
            return o80.y(g85Var);
        } finally {
            s0.close();
        }
    }

    public static final pn6 setStopReason$lambda$0(String str, int i, String str2, g85 g85Var) {
        g85Var.getClass();
        m85 s0 = g85Var.s0(str);
        try {
            s0.e(1, i);
            s0.J(2, str2);
            s0.p0();
            s0.close();
            return pn6.a;
        } catch (Throwable th) {
            s0.close();
            throw th;
        }
    }

    public static final pn6 updateWorkSpec$lambda$0(WorkSpecDao_Impl workSpecDao_Impl, z77 z77Var, g85 g85Var) {
        g85Var.getClass();
        workSpecDao_Impl.__updateAdapterOfWorkSpec.handle(g85Var, z77Var);
        return pn6.a;
    }

    @Override // defpackage.a87
    public int countNonFinishedContentUriTriggerWorkers() {
        return ((Number) q23.J(this.__db, true, false, new dr6((byte) 29))).intValue();
    }

    @Override // defpackage.a87
    public void delete(String str) {
        str.getClass();
        q23.J(this.__db, false, true, new r77(str, (byte) 4));
    }

    @Override // defpackage.a87
    public List<z77> getAllEligibleWorkSpecsForScheduling(int i) {
        return (List) q23.J(this.__db, true, false, new da(i, (byte) 9));
    }

    public List<z77> getAllUnblockedWork() {
        return (List) q23.J(this.__db, true, false, new b87((byte) 3));
    }

    public List<String> getAllUnfinishedWork() {
        return (List) q23.J(this.__db, true, false, new dr6((byte) 27));
    }

    public List<String> getAllWorkSpecIds() {
        return (List) q23.J(this.__db, true, false, new b87((byte) 5));
    }

    public cj3 getAllWorkSpecIdsLiveData() {
        return this.__db.getInvalidationTracker().b(new String[]{"workspec"}, true, new b87((byte) 6));
    }

    @Override // defpackage.a87
    public List<z77> getEligibleWorkForScheduling(int i) {
        return (List) q23.J(this.__db, true, false, new da(i, (byte) 10));
    }

    @Override // defpackage.a87
    public List<z77> getEligibleWorkForSchedulingWithContentUris() {
        return (List) q23.J(this.__db, true, false, new b87((byte) 8));
    }

    @Override // defpackage.a87
    public List<e41> getInputsFromPrerequisites(String str) {
        str.getClass();
        return (List) q23.J(this.__db, true, false, new r77(str, (byte) 10));
    }

    @Override // defpackage.a87
    public List<z77> getRecentlyCompletedWork(long j) {
        return (List) q23.J(this.__db, true, false, new pb(j, (byte) 9));
    }

    @Override // defpackage.a87
    public List<z77> getRunningWork() {
        return (List) q23.J(this.__db, true, false, new b87((byte) 7));
    }

    public cj3 getScheduleRequestedAtLiveData(String str) {
        str.getClass();
        return this.__db.getInvalidationTracker().b(new String[]{"workspec"}, false, new r77(str, (byte) 17));
    }

    public List<z77> getScheduledWork() {
        return (List) q23.J(this.__db, true, false, new b87((byte) 4));
    }

    @Override // defpackage.a87
    public List<z77> getScheduledWorkWithContentUris() {
        return (List) q23.J(this.__db, true, false, new dr6((byte) 28));
    }

    @Override // defpackage.a87
    public j77 getState(String str) {
        str.getClass();
        return (j77) q23.J(this.__db, true, false, new r77(str, (byte) 16));
    }

    @Override // defpackage.a87
    public List<String> getUnfinishedWorkWithName(String str) {
        str.getClass();
        return (List) q23.J(this.__db, true, false, new r77(str, (byte) 6));
    }

    public List<String> getUnfinishedWorkWithTag(String str) {
        str.getClass();
        return (List) q23.J(this.__db, true, false, new r77(str, (byte) 14));
    }

    @Override // defpackage.a87
    public z77 getWorkSpec(String str) {
        str.getClass();
        return (z77) q23.J(this.__db, true, false, new r77(str, (byte) 9));
    }

    @Override // defpackage.a87
    public List<x77> getWorkSpecIdAndStatesForName(String str) {
        str.getClass();
        return (List) q23.J(this.__db, true, false, new r77(str, (byte) 5));
    }

    public w42 getWorkStatusPojoFlowDataForIds(List<String> list) {
        list.getClass();
        StringBuilder sb = new StringBuilder();
        sb.append("SELECT id, state, output, run_attempt_count, generation, required_network_type, required_network_request, requires_charging, requires_device_idle, requires_battery_not_low, requires_storage_not_low, trigger_content_update_delay, trigger_max_content_delay, content_uri_triggers, initial_delay, interval_duration, flex_duration, backoff_policy, backoff_delay_duration, last_enqueue_time, period_count, next_schedule_time_override, stop_reason, worker_class_name FROM workspec WHERE id IN (");
        nz5.a(sb, list.size());
        sb.append(")");
        return a34.M(this.__db, true, new String[]{"WorkTag", "WorkProgress", "workspec"}, new d87(sb.toString(), list, this, (byte) 0));
    }

    public w42 getWorkStatusPojoFlowForName(String str) {
        str.getClass();
        return a34.M(this.__db, true, new String[]{"WorkTag", "WorkProgress", "workspec", "workname"}, new c87(str, this, (byte) 4));
    }

    public w42 getWorkStatusPojoFlowForTag(String str) {
        str.getClass();
        return a34.M(this.__db, true, new String[]{"WorkTag", "WorkProgress", "workspec", "worktag"}, new c87(str, this, (byte) 0));
    }

    public y77 getWorkStatusPojoForId(String str) {
        str.getClass();
        return (y77) q23.J(this.__db, true, true, new c87(str, this, (byte) 5));
    }

    public List<y77> getWorkStatusPojoForIds(List<String> list) {
        list.getClass();
        StringBuilder sb = new StringBuilder();
        sb.append("SELECT id, state, output, run_attempt_count, generation, required_network_type, required_network_request, requires_charging, requires_device_idle, requires_battery_not_low, requires_storage_not_low, trigger_content_update_delay, trigger_max_content_delay, content_uri_triggers, initial_delay, interval_duration, flex_duration, backoff_policy, backoff_delay_duration, last_enqueue_time, period_count, next_schedule_time_override, stop_reason, worker_class_name FROM workspec WHERE id IN (");
        nz5.a(sb, list.size());
        sb.append(")");
        return (List) q23.J(this.__db, true, true, new d87(sb.toString(), list, this, (byte) 2));
    }

    public List<y77> getWorkStatusPojoForName(String str) {
        str.getClass();
        return (List) q23.J(this.__db, true, true, new c87(str, this, (byte) 3));
    }

    public List<y77> getWorkStatusPojoForTag(String str) {
        str.getClass();
        return (List) q23.J(this.__db, true, true, new c87(str, this, (byte) 1));
    }

    public cj3 getWorkStatusPojoLiveDataForIds(List<String> list) {
        list.getClass();
        StringBuilder sb = new StringBuilder();
        sb.append("SELECT id, state, output, run_attempt_count, generation, required_network_type, required_network_request, requires_charging, requires_device_idle, requires_battery_not_low, requires_storage_not_low, trigger_content_update_delay, trigger_max_content_delay, content_uri_triggers, initial_delay, interval_duration, flex_duration, backoff_policy, backoff_delay_duration, last_enqueue_time, period_count, next_schedule_time_override, stop_reason, worker_class_name FROM workspec WHERE id IN (");
        nz5.a(sb, list.size());
        sb.append(")");
        return this.__db.getInvalidationTracker().b(new String[]{"WorkTag", "WorkProgress", "workspec"}, true, new d87(sb.toString(), list, this, (byte) 1));
    }

    public cj3 getWorkStatusPojoLiveDataForName(String str) {
        str.getClass();
        return this.__db.getInvalidationTracker().b(new String[]{"WorkTag", "WorkProgress", "workspec", "workname"}, true, new c87(str, this, (byte) 2));
    }

    public cj3 getWorkStatusPojoLiveDataForTag(String str) {
        str.getClass();
        return this.__db.getInvalidationTracker().b(new String[]{"WorkTag", "WorkProgress", "workspec", "worktag"}, true, new c87(str, this, (byte) 6));
    }

    @Override // defpackage.a87
    public w42 hasUnfinishedWorkFlow() {
        return a34.M(this.__db, false, new String[]{"workspec"}, new b87((byte) 1));
    }

    public void incrementGeneration(String str) {
        str.getClass();
        q23.J(this.__db, false, true, new r77(str, (byte) 11));
    }

    @Override // defpackage.a87
    public void incrementPeriodCount(String str) {
        str.getClass();
        q23.J(this.__db, false, true, new r77(str, (byte) 8));
    }

    @Override // defpackage.a87
    public int incrementWorkSpecRunAttemptCount(String str) {
        str.getClass();
        return ((Number) q23.J(this.__db, false, true, new r77(str, (byte) 15))).intValue();
    }

    @Override // defpackage.a87
    public void insertWorkSpec(z77 z77Var) {
        z77Var.getClass();
        q23.J(this.__db, false, true, new e87(this, z77Var, (byte) 1));
    }

    @Override // defpackage.a87
    public boolean isWorkSpecScheduled(String str) {
        str.getClass();
        return ((Boolean) q23.J(this.__db, true, false, new r77(str, (byte) 13))).booleanValue();
    }

    @Override // defpackage.a87
    public int markWorkSpecScheduled(String str, long j) {
        str.getClass();
        return ((Number) q23.J(this.__db, false, true, new f87(j, str, (byte) 1))).intValue();
    }

    public void pruneFinishedWorkWithZeroDependentsIgnoringKeepForAtLeast() {
        q23.J(this.__db, false, true, new b87((byte) 0));
    }

    @Override // defpackage.a87
    public int resetScheduledState() {
        return ((Number) q23.J(this.__db, false, true, new b87((byte) 2))).intValue();
    }

    @Override // defpackage.a87
    public void resetWorkSpecNextScheduleTimeOverride(String str, int i) {
        str.getClass();
        q23.J(this.__db, false, true, new wm(str, i, (byte) 7));
    }

    @Override // defpackage.a87
    public int resetWorkSpecRunAttemptCount(String str) {
        str.getClass();
        return ((Number) q23.J(this.__db, false, true, new r77(str, (byte) 7))).intValue();
    }

    @Override // defpackage.a87
    public int setCancelledState(String str) {
        str.getClass();
        return ((Number) q23.J(this.__db, false, true, new r77(str, (byte) 12))).intValue();
    }

    @Override // defpackage.a87
    public void setLastEnqueueTime(String str, long j) {
        str.getClass();
        q23.J(this.__db, false, true, new f87(j, str, (byte) 2));
    }

    public void setNextScheduleTimeOverride(String str, long j) {
        str.getClass();
        q23.J(this.__db, false, true, new f87(j, str, (byte) 0));
    }

    @Override // defpackage.a87
    public void setOutput(String str, e41 e41Var) {
        str.getClass();
        e41Var.getClass();
        q23.J(this.__db, false, true, new ll5(e41Var, str, (byte) 28));
    }

    @Override // defpackage.a87
    public int setState(j77 j77Var, String str) {
        j77Var.getClass();
        str.getClass();
        return ((Number) q23.J(this.__db, false, true, new ll5(j77Var, str, (byte) 29))).intValue();
    }

    @Override // defpackage.a87
    public void setStopReason(String str, int i) {
        str.getClass();
        q23.J(this.__db, false, true, new wm(i, str));
    }

    @Override // defpackage.a87
    public void updateWorkSpec(z77 z77Var) {
        z77Var.getClass();
        q23.J(this.__db, false, true, new e87(this, z77Var, (byte) 0));
    }

    /* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
    /* loaded from: classes.dex */
    public static final class Companion {
        public /* synthetic */ Companion(q71 q71Var) {
            this();
        }

        public final List<e73> getRequiredConverters() {
            return nt1.x;
        }

        private Companion() {
        }
    }
}
