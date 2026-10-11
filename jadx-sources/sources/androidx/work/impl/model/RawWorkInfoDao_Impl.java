package androidx.work.impl.model;

import defpackage.a34;
import defpackage.b75;
import defpackage.c00;
import defpackage.c36;
import defpackage.c75;
import defpackage.cj3;
import defpackage.e41;
import defpackage.e73;
import defpackage.f94;
import defpackage.fs;
import defpackage.g85;
import defpackage.gs;
import defpackage.gy5;
import defpackage.j77;
import defpackage.js;
import defpackage.k94;
import defpackage.kb0;
import defpackage.ly4;
import defpackage.m85;
import defpackage.my4;
import defpackage.nt1;
import defpackage.nz5;
import defpackage.pn6;
import defpackage.pz3;
import defpackage.q23;
import defpackage.q71;
import defpackage.qx0;
import defpackage.so5;
import defpackage.t80;
import defpackage.tl7;
import defpackage.v65;
import defpackage.vn3;
import defpackage.w42;
import defpackage.y77;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public final class RawWorkInfoDao_Impl implements ly4 {
    public static final Companion Companion = new Companion(null);
    private final v65 __db;

    public RawWorkInfoDao_Impl(v65 v65Var) {
        v65Var.getClass();
        this.__db = v65Var;
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

    public static final pn6 __fetchRelationshipWorkProgressAsandroidxWorkData$lambda$0(RawWorkInfoDao_Impl rawWorkInfoDao_Impl, g85 g85Var, js jsVar) {
        jsVar.getClass();
        rawWorkInfoDao_Impl.__fetchRelationshipWorkProgressAsandroidxWorkData(g85Var, jsVar);
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

    public static final pn6 __fetchRelationshipWorkTagAsjavaLangString$lambda$0(RawWorkInfoDao_Impl rawWorkInfoDao_Impl, g85 g85Var, js jsVar) {
        jsVar.getClass();
        rawWorkInfoDao_Impl.__fetchRelationshipWorkTagAsjavaLangString(g85Var, jsVar);
        return pn6.a;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r13v2, types: [so5, js] */
    /* JADX WARN: Type inference failed for: r15v24, types: [java.util.Map, so5, js] */
    public static final List getWorkInfoPojos$lambda$0(String str, b75 b75Var, RawWorkInfoDao_Impl rawWorkInfoDao_Impl, g85 g85Var) {
        long j;
        long j2;
        long j3;
        int i;
        long j4;
        long j5;
        int i2;
        int i3;
        int i4;
        int i5;
        int i6;
        long j6;
        int i7;
        int i8;
        int i9;
        int i10;
        int i11;
        boolean z;
        boolean z2;
        int i12;
        boolean z3;
        boolean z4;
        int i13;
        boolean z5;
        boolean z6;
        int i14;
        int i15;
        boolean z7;
        boolean z8;
        long j7;
        long j8;
        int i16;
        g85Var.getClass();
        m85 s0 = g85Var.s0(str);
        try {
            b75Var.a.invoke(s0);
            int J = t80.J(s0, "id");
            int n = kb0.n(s0, "state");
            int n2 = kb0.n(s0, "output");
            int n3 = kb0.n(s0, "initial_delay");
            int n4 = kb0.n(s0, "interval_duration");
            int n5 = kb0.n(s0, "flex_duration");
            int n6 = kb0.n(s0, "run_attempt_count");
            int n7 = kb0.n(s0, "backoff_policy");
            int n8 = kb0.n(s0, "backoff_delay_duration");
            int n9 = kb0.n(s0, "last_enqueue_time");
            int n10 = kb0.n(s0, "period_count");
            int n11 = kb0.n(s0, "generation");
            int n12 = kb0.n(s0, "next_schedule_time_override");
            int n13 = kb0.n(s0, "stop_reason");
            int n14 = kb0.n(s0, "worker_class_name");
            int n15 = kb0.n(s0, "required_network_type");
            int n16 = kb0.n(s0, "required_network_request");
            int n17 = kb0.n(s0, "requires_charging");
            int n18 = kb0.n(s0, "requires_device_idle");
            int n19 = kb0.n(s0, "requires_battery_not_low");
            int n20 = kb0.n(s0, "requires_storage_not_low");
            int n21 = kb0.n(s0, "trigger_content_update_delay");
            int n22 = kb0.n(s0, "trigger_max_content_delay");
            int n23 = kb0.n(s0, "content_uri_triggers");
            int i17 = n11;
            ?? so5Var = new so5(0);
            int i18 = n10;
            ?? so5Var2 = new so5(0);
            while (s0.p0()) {
                String c0 = s0.c0(J);
                if (!so5Var.containsKey(c0)) {
                    i16 = n9;
                    so5Var.put(c0, new ArrayList());
                } else {
                    i16 = n9;
                }
                String c02 = s0.c0(J);
                if (!so5Var2.containsKey(c02)) {
                    so5Var2.put(c02, new ArrayList());
                }
                n9 = i16;
            }
            int i19 = n9;
            s0.reset();
            rawWorkInfoDao_Impl.__fetchRelationshipWorkTagAsjavaLangString(g85Var, so5Var);
            rawWorkInfoDao_Impl.__fetchRelationshipWorkProgressAsandroidxWorkData(g85Var, so5Var2);
            ArrayList arrayList = new ArrayList();
            Map map = so5Var2;
            while (s0.p0()) {
                if (J != -1) {
                    String c03 = s0.c0(J);
                    if (n != -1) {
                        Map map2 = map;
                        j77 k = gy5.k((int) s0.getLong(n));
                        if (n2 != -1) {
                            byte[] blob = s0.getBlob(n2);
                            e41 e41Var = e41.b;
                            e41 U = a34.U(blob);
                            if (n3 == -1) {
                                j = 0;
                            } else {
                                j = s0.getLong(n3);
                            }
                            if (n4 == -1) {
                                j2 = 0;
                            } else {
                                j2 = s0.getLong(n4);
                            }
                            if (n5 == -1) {
                                j3 = 0;
                            } else {
                                j3 = s0.getLong(n5);
                            }
                            if (n6 == -1) {
                                i = 0;
                            } else {
                                i = (int) s0.getLong(n6);
                            }
                            if (n7 != -1) {
                                c00 h = gy5.h((int) s0.getLong(n7));
                                if (n8 == -1) {
                                    j4 = 0;
                                } else {
                                    j4 = s0.getLong(n8);
                                }
                                int i20 = i19;
                                if (i20 == -1) {
                                    j5 = 0;
                                } else {
                                    j5 = s0.getLong(i20);
                                }
                                int i21 = i18;
                                if (i21 == -1) {
                                    i2 = n;
                                    i3 = n2;
                                    i4 = 0;
                                } else {
                                    i2 = n;
                                    i3 = n2;
                                    i4 = (int) s0.getLong(i21);
                                }
                                int i22 = i17;
                                if (i22 == -1) {
                                    i6 = 0;
                                    i5 = n3;
                                } else {
                                    i5 = n3;
                                    i6 = (int) s0.getLong(i22);
                                }
                                int i23 = n12;
                                if (i23 == -1) {
                                    j6 = 0;
                                } else {
                                    j6 = s0.getLong(i23);
                                }
                                int i24 = n13;
                                if (i24 == -1) {
                                    i7 = i22;
                                    i8 = i23;
                                    i9 = 0;
                                } else {
                                    i7 = i22;
                                    i8 = i23;
                                    i9 = (int) s0.getLong(i24);
                                }
                                int i25 = n14;
                                if (i25 != -1) {
                                    String c04 = s0.c0(i25);
                                    int i26 = n15;
                                    if (i26 != -1) {
                                        int i27 = n4;
                                        k94 i28 = gy5.i((int) s0.getLong(i26));
                                        int i29 = n16;
                                        if (i29 != -1) {
                                            f94 r = gy5.r(s0.getBlob(i29));
                                            int i30 = n17;
                                            if (i30 == -1) {
                                                i10 = i25;
                                                i11 = i26;
                                                z2 = false;
                                            } else {
                                                i10 = i25;
                                                i11 = i26;
                                                if (((int) s0.getLong(i30)) != 0) {
                                                    z = true;
                                                } else {
                                                    z = false;
                                                }
                                                z2 = z;
                                            }
                                            int i31 = n18;
                                            if (i31 == -1) {
                                                i12 = i29;
                                                z4 = false;
                                            } else {
                                                i12 = i29;
                                                if (((int) s0.getLong(i31)) != 0) {
                                                    z3 = true;
                                                } else {
                                                    z3 = false;
                                                }
                                                z4 = z3;
                                            }
                                            int i32 = n19;
                                            if (i32 == -1) {
                                                i13 = i30;
                                                z6 = false;
                                            } else {
                                                i13 = i30;
                                                if (((int) s0.getLong(i32)) != 0) {
                                                    z5 = true;
                                                } else {
                                                    z5 = false;
                                                }
                                                z6 = z5;
                                            }
                                            int i33 = n20;
                                            if (i33 == -1) {
                                                i14 = i31;
                                                i15 = i32;
                                                z8 = false;
                                            } else {
                                                i14 = i31;
                                                i15 = i32;
                                                if (((int) s0.getLong(i33)) != 0) {
                                                    z7 = true;
                                                } else {
                                                    z7 = false;
                                                }
                                                z8 = z7;
                                            }
                                            int i34 = n21;
                                            if (i34 == -1) {
                                                j7 = 0;
                                            } else {
                                                j7 = s0.getLong(i34);
                                            }
                                            int i35 = n22;
                                            if (i35 == -1) {
                                                j8 = 0;
                                            } else {
                                                j8 = s0.getLong(i35);
                                            }
                                            n21 = i34;
                                            int i36 = n23;
                                            if (i36 != -1) {
                                                qx0 qx0Var = new qx0(r, i28, z2, z4, z6, z8, j7, j8, gy5.a(s0.getBlob(i36)));
                                                Object Q = vn3.Q(s0.c0(J), so5Var);
                                                Q.getClass();
                                                List list = (List) Q;
                                                Object Q2 = vn3.Q(s0.c0(J), map2);
                                                Q2.getClass();
                                                arrayList.add(new y77(c03, k, U, j, j2, j3, qx0Var, i, h, j4, j5, i4, i6, j6, i9, list, c04, (List) Q2));
                                                n23 = i36;
                                                n22 = i35;
                                                n16 = i12;
                                                n = i2;
                                                n2 = i3;
                                                n18 = i14;
                                                i19 = i20;
                                                i18 = i21;
                                                map = map2;
                                                n4 = i27;
                                                n14 = i10;
                                                n17 = i13;
                                                n19 = i15;
                                                n20 = i33;
                                                n3 = i5;
                                                i17 = i7;
                                                n12 = i8;
                                                n13 = i24;
                                                n15 = i11;
                                            } else {
                                                throw new IllegalStateException("Missing value for a NON-NULL column 'content_uri_triggers', found NULL value instead.");
                                            }
                                        } else {
                                            throw new IllegalStateException("Missing value for a NON-NULL column 'required_network_request', found NULL value instead.");
                                        }
                                    } else {
                                        throw new IllegalStateException("Missing value for a NON-NULL column 'required_network_type', found NULL value instead.");
                                    }
                                } else {
                                    throw new IllegalStateException("Missing value for a NON-NULL column 'worker_class_name', found NULL value instead.");
                                }
                            } else {
                                throw new IllegalStateException("Missing value for a NON-NULL column 'backoff_policy', found NULL value instead.");
                            }
                        } else {
                            throw new IllegalStateException("Missing value for a NON-NULL column 'output', found NULL value instead.");
                        }
                    } else {
                        throw new IllegalStateException("Missing value for a NON-NULL column 'state', found NULL value instead.");
                    }
                } else {
                    throw new IllegalStateException("Missing value for a NON-NULL column 'id', found NULL value instead.");
                }
            }
            s0.close();
            return arrayList;
        } catch (Throwable th) {
            s0.close();
            throw th;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r13v2, types: [so5, js] */
    /* JADX WARN: Type inference failed for: r15v24, types: [java.util.Map, so5, js] */
    public static final List getWorkInfoPojosFlow$lambda$0(String str, b75 b75Var, RawWorkInfoDao_Impl rawWorkInfoDao_Impl, g85 g85Var) {
        long j;
        long j2;
        long j3;
        int i;
        long j4;
        long j5;
        int i2;
        int i3;
        int i4;
        int i5;
        int i6;
        long j6;
        int i7;
        int i8;
        int i9;
        int i10;
        int i11;
        boolean z;
        boolean z2;
        int i12;
        boolean z3;
        boolean z4;
        int i13;
        boolean z5;
        boolean z6;
        int i14;
        int i15;
        boolean z7;
        boolean z8;
        long j7;
        long j8;
        int i16;
        g85Var.getClass();
        m85 s0 = g85Var.s0(str);
        try {
            b75Var.a.invoke(s0);
            int J = t80.J(s0, "id");
            int n = kb0.n(s0, "state");
            int n2 = kb0.n(s0, "output");
            int n3 = kb0.n(s0, "initial_delay");
            int n4 = kb0.n(s0, "interval_duration");
            int n5 = kb0.n(s0, "flex_duration");
            int n6 = kb0.n(s0, "run_attempt_count");
            int n7 = kb0.n(s0, "backoff_policy");
            int n8 = kb0.n(s0, "backoff_delay_duration");
            int n9 = kb0.n(s0, "last_enqueue_time");
            int n10 = kb0.n(s0, "period_count");
            int n11 = kb0.n(s0, "generation");
            int n12 = kb0.n(s0, "next_schedule_time_override");
            int n13 = kb0.n(s0, "stop_reason");
            int n14 = kb0.n(s0, "worker_class_name");
            int n15 = kb0.n(s0, "required_network_type");
            int n16 = kb0.n(s0, "required_network_request");
            int n17 = kb0.n(s0, "requires_charging");
            int n18 = kb0.n(s0, "requires_device_idle");
            int n19 = kb0.n(s0, "requires_battery_not_low");
            int n20 = kb0.n(s0, "requires_storage_not_low");
            int n21 = kb0.n(s0, "trigger_content_update_delay");
            int n22 = kb0.n(s0, "trigger_max_content_delay");
            int n23 = kb0.n(s0, "content_uri_triggers");
            int i17 = n11;
            ?? so5Var = new so5(0);
            int i18 = n10;
            ?? so5Var2 = new so5(0);
            while (s0.p0()) {
                String c0 = s0.c0(J);
                if (!so5Var.containsKey(c0)) {
                    i16 = n9;
                    so5Var.put(c0, new ArrayList());
                } else {
                    i16 = n9;
                }
                String c02 = s0.c0(J);
                if (!so5Var2.containsKey(c02)) {
                    so5Var2.put(c02, new ArrayList());
                }
                n9 = i16;
            }
            int i19 = n9;
            s0.reset();
            rawWorkInfoDao_Impl.__fetchRelationshipWorkTagAsjavaLangString(g85Var, so5Var);
            rawWorkInfoDao_Impl.__fetchRelationshipWorkProgressAsandroidxWorkData(g85Var, so5Var2);
            ArrayList arrayList = new ArrayList();
            Map map = so5Var2;
            while (s0.p0()) {
                if (J != -1) {
                    String c03 = s0.c0(J);
                    if (n != -1) {
                        Map map2 = map;
                        j77 k = gy5.k((int) s0.getLong(n));
                        if (n2 != -1) {
                            byte[] blob = s0.getBlob(n2);
                            e41 e41Var = e41.b;
                            e41 U = a34.U(blob);
                            if (n3 == -1) {
                                j = 0;
                            } else {
                                j = s0.getLong(n3);
                            }
                            if (n4 == -1) {
                                j2 = 0;
                            } else {
                                j2 = s0.getLong(n4);
                            }
                            if (n5 == -1) {
                                j3 = 0;
                            } else {
                                j3 = s0.getLong(n5);
                            }
                            if (n6 == -1) {
                                i = 0;
                            } else {
                                i = (int) s0.getLong(n6);
                            }
                            if (n7 != -1) {
                                c00 h = gy5.h((int) s0.getLong(n7));
                                if (n8 == -1) {
                                    j4 = 0;
                                } else {
                                    j4 = s0.getLong(n8);
                                }
                                int i20 = i19;
                                if (i20 == -1) {
                                    j5 = 0;
                                } else {
                                    j5 = s0.getLong(i20);
                                }
                                int i21 = i18;
                                if (i21 == -1) {
                                    i2 = n;
                                    i3 = n2;
                                    i4 = 0;
                                } else {
                                    i2 = n;
                                    i3 = n2;
                                    i4 = (int) s0.getLong(i21);
                                }
                                int i22 = i17;
                                if (i22 == -1) {
                                    i6 = 0;
                                    i5 = n3;
                                } else {
                                    i5 = n3;
                                    i6 = (int) s0.getLong(i22);
                                }
                                int i23 = n12;
                                if (i23 == -1) {
                                    j6 = 0;
                                } else {
                                    j6 = s0.getLong(i23);
                                }
                                int i24 = n13;
                                if (i24 == -1) {
                                    i7 = i22;
                                    i8 = i23;
                                    i9 = 0;
                                } else {
                                    i7 = i22;
                                    i8 = i23;
                                    i9 = (int) s0.getLong(i24);
                                }
                                int i25 = n14;
                                if (i25 != -1) {
                                    String c04 = s0.c0(i25);
                                    int i26 = n15;
                                    if (i26 != -1) {
                                        int i27 = n4;
                                        k94 i28 = gy5.i((int) s0.getLong(i26));
                                        int i29 = n16;
                                        if (i29 != -1) {
                                            f94 r = gy5.r(s0.getBlob(i29));
                                            int i30 = n17;
                                            if (i30 == -1) {
                                                i10 = i25;
                                                i11 = i26;
                                                z2 = false;
                                            } else {
                                                i10 = i25;
                                                i11 = i26;
                                                if (((int) s0.getLong(i30)) != 0) {
                                                    z = true;
                                                } else {
                                                    z = false;
                                                }
                                                z2 = z;
                                            }
                                            int i31 = n18;
                                            if (i31 == -1) {
                                                i12 = i29;
                                                z4 = false;
                                            } else {
                                                i12 = i29;
                                                if (((int) s0.getLong(i31)) != 0) {
                                                    z3 = true;
                                                } else {
                                                    z3 = false;
                                                }
                                                z4 = z3;
                                            }
                                            int i32 = n19;
                                            if (i32 == -1) {
                                                i13 = i30;
                                                z6 = false;
                                            } else {
                                                i13 = i30;
                                                if (((int) s0.getLong(i32)) != 0) {
                                                    z5 = true;
                                                } else {
                                                    z5 = false;
                                                }
                                                z6 = z5;
                                            }
                                            int i33 = n20;
                                            if (i33 == -1) {
                                                i14 = i31;
                                                i15 = i32;
                                                z8 = false;
                                            } else {
                                                i14 = i31;
                                                i15 = i32;
                                                if (((int) s0.getLong(i33)) != 0) {
                                                    z7 = true;
                                                } else {
                                                    z7 = false;
                                                }
                                                z8 = z7;
                                            }
                                            int i34 = n21;
                                            if (i34 == -1) {
                                                j7 = 0;
                                            } else {
                                                j7 = s0.getLong(i34);
                                            }
                                            int i35 = n22;
                                            if (i35 == -1) {
                                                j8 = 0;
                                            } else {
                                                j8 = s0.getLong(i35);
                                            }
                                            n21 = i34;
                                            int i36 = n23;
                                            if (i36 != -1) {
                                                qx0 qx0Var = new qx0(r, i28, z2, z4, z6, z8, j7, j8, gy5.a(s0.getBlob(i36)));
                                                Object Q = vn3.Q(s0.c0(J), so5Var);
                                                Q.getClass();
                                                List list = (List) Q;
                                                Object Q2 = vn3.Q(s0.c0(J), map2);
                                                Q2.getClass();
                                                arrayList.add(new y77(c03, k, U, j, j2, j3, qx0Var, i, h, j4, j5, i4, i6, j6, i9, list, c04, (List) Q2));
                                                n23 = i36;
                                                n22 = i35;
                                                n16 = i12;
                                                n = i2;
                                                n2 = i3;
                                                n18 = i14;
                                                i19 = i20;
                                                i18 = i21;
                                                map = map2;
                                                n4 = i27;
                                                n14 = i10;
                                                n17 = i13;
                                                n19 = i15;
                                                n20 = i33;
                                                n3 = i5;
                                                i17 = i7;
                                                n12 = i8;
                                                n13 = i24;
                                                n15 = i11;
                                            } else {
                                                throw new IllegalStateException("Missing value for a NON-NULL column 'content_uri_triggers', found NULL value instead.");
                                            }
                                        } else {
                                            throw new IllegalStateException("Missing value for a NON-NULL column 'required_network_request', found NULL value instead.");
                                        }
                                    } else {
                                        throw new IllegalStateException("Missing value for a NON-NULL column 'required_network_type', found NULL value instead.");
                                    }
                                } else {
                                    throw new IllegalStateException("Missing value for a NON-NULL column 'worker_class_name', found NULL value instead.");
                                }
                            } else {
                                throw new IllegalStateException("Missing value for a NON-NULL column 'backoff_policy', found NULL value instead.");
                            }
                        } else {
                            throw new IllegalStateException("Missing value for a NON-NULL column 'output', found NULL value instead.");
                        }
                    } else {
                        throw new IllegalStateException("Missing value for a NON-NULL column 'state', found NULL value instead.");
                    }
                } else {
                    throw new IllegalStateException("Missing value for a NON-NULL column 'id', found NULL value instead.");
                }
            }
            s0.close();
            return arrayList;
        } catch (Throwable th) {
            s0.close();
            throw th;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r13v2, types: [so5, js] */
    /* JADX WARN: Type inference failed for: r15v24, types: [java.util.Map, so5, js] */
    public static final List getWorkInfoPojosLiveData$lambda$0(String str, b75 b75Var, RawWorkInfoDao_Impl rawWorkInfoDao_Impl, g85 g85Var) {
        long j;
        long j2;
        long j3;
        int i;
        long j4;
        long j5;
        int i2;
        int i3;
        int i4;
        int i5;
        int i6;
        long j6;
        int i7;
        int i8;
        int i9;
        int i10;
        int i11;
        boolean z;
        boolean z2;
        int i12;
        boolean z3;
        boolean z4;
        int i13;
        boolean z5;
        boolean z6;
        int i14;
        int i15;
        boolean z7;
        boolean z8;
        long j7;
        long j8;
        int i16;
        g85Var.getClass();
        m85 s0 = g85Var.s0(str);
        try {
            b75Var.a.invoke(s0);
            int J = t80.J(s0, "id");
            int n = kb0.n(s0, "state");
            int n2 = kb0.n(s0, "output");
            int n3 = kb0.n(s0, "initial_delay");
            int n4 = kb0.n(s0, "interval_duration");
            int n5 = kb0.n(s0, "flex_duration");
            int n6 = kb0.n(s0, "run_attempt_count");
            int n7 = kb0.n(s0, "backoff_policy");
            int n8 = kb0.n(s0, "backoff_delay_duration");
            int n9 = kb0.n(s0, "last_enqueue_time");
            int n10 = kb0.n(s0, "period_count");
            int n11 = kb0.n(s0, "generation");
            int n12 = kb0.n(s0, "next_schedule_time_override");
            int n13 = kb0.n(s0, "stop_reason");
            int n14 = kb0.n(s0, "worker_class_name");
            int n15 = kb0.n(s0, "required_network_type");
            int n16 = kb0.n(s0, "required_network_request");
            int n17 = kb0.n(s0, "requires_charging");
            int n18 = kb0.n(s0, "requires_device_idle");
            int n19 = kb0.n(s0, "requires_battery_not_low");
            int n20 = kb0.n(s0, "requires_storage_not_low");
            int n21 = kb0.n(s0, "trigger_content_update_delay");
            int n22 = kb0.n(s0, "trigger_max_content_delay");
            int n23 = kb0.n(s0, "content_uri_triggers");
            int i17 = n11;
            ?? so5Var = new so5(0);
            int i18 = n10;
            ?? so5Var2 = new so5(0);
            while (s0.p0()) {
                String c0 = s0.c0(J);
                if (!so5Var.containsKey(c0)) {
                    i16 = n9;
                    so5Var.put(c0, new ArrayList());
                } else {
                    i16 = n9;
                }
                String c02 = s0.c0(J);
                if (!so5Var2.containsKey(c02)) {
                    so5Var2.put(c02, new ArrayList());
                }
                n9 = i16;
            }
            int i19 = n9;
            s0.reset();
            rawWorkInfoDao_Impl.__fetchRelationshipWorkTagAsjavaLangString(g85Var, so5Var);
            rawWorkInfoDao_Impl.__fetchRelationshipWorkProgressAsandroidxWorkData(g85Var, so5Var2);
            ArrayList arrayList = new ArrayList();
            Map map = so5Var2;
            while (s0.p0()) {
                if (J != -1) {
                    String c03 = s0.c0(J);
                    if (n != -1) {
                        Map map2 = map;
                        j77 k = gy5.k((int) s0.getLong(n));
                        if (n2 != -1) {
                            byte[] blob = s0.getBlob(n2);
                            e41 e41Var = e41.b;
                            e41 U = a34.U(blob);
                            if (n3 == -1) {
                                j = 0;
                            } else {
                                j = s0.getLong(n3);
                            }
                            if (n4 == -1) {
                                j2 = 0;
                            } else {
                                j2 = s0.getLong(n4);
                            }
                            if (n5 == -1) {
                                j3 = 0;
                            } else {
                                j3 = s0.getLong(n5);
                            }
                            if (n6 == -1) {
                                i = 0;
                            } else {
                                i = (int) s0.getLong(n6);
                            }
                            if (n7 != -1) {
                                c00 h = gy5.h((int) s0.getLong(n7));
                                if (n8 == -1) {
                                    j4 = 0;
                                } else {
                                    j4 = s0.getLong(n8);
                                }
                                int i20 = i19;
                                if (i20 == -1) {
                                    j5 = 0;
                                } else {
                                    j5 = s0.getLong(i20);
                                }
                                int i21 = i18;
                                if (i21 == -1) {
                                    i2 = n;
                                    i3 = n2;
                                    i4 = 0;
                                } else {
                                    i2 = n;
                                    i3 = n2;
                                    i4 = (int) s0.getLong(i21);
                                }
                                int i22 = i17;
                                if (i22 == -1) {
                                    i6 = 0;
                                    i5 = n3;
                                } else {
                                    i5 = n3;
                                    i6 = (int) s0.getLong(i22);
                                }
                                int i23 = n12;
                                if (i23 == -1) {
                                    j6 = 0;
                                } else {
                                    j6 = s0.getLong(i23);
                                }
                                int i24 = n13;
                                if (i24 == -1) {
                                    i7 = i22;
                                    i8 = i23;
                                    i9 = 0;
                                } else {
                                    i7 = i22;
                                    i8 = i23;
                                    i9 = (int) s0.getLong(i24);
                                }
                                int i25 = n14;
                                if (i25 != -1) {
                                    String c04 = s0.c0(i25);
                                    int i26 = n15;
                                    if (i26 != -1) {
                                        int i27 = n4;
                                        k94 i28 = gy5.i((int) s0.getLong(i26));
                                        int i29 = n16;
                                        if (i29 != -1) {
                                            f94 r = gy5.r(s0.getBlob(i29));
                                            int i30 = n17;
                                            if (i30 == -1) {
                                                i10 = i25;
                                                i11 = i26;
                                                z2 = false;
                                            } else {
                                                i10 = i25;
                                                i11 = i26;
                                                if (((int) s0.getLong(i30)) != 0) {
                                                    z = true;
                                                } else {
                                                    z = false;
                                                }
                                                z2 = z;
                                            }
                                            int i31 = n18;
                                            if (i31 == -1) {
                                                i12 = i29;
                                                z4 = false;
                                            } else {
                                                i12 = i29;
                                                if (((int) s0.getLong(i31)) != 0) {
                                                    z3 = true;
                                                } else {
                                                    z3 = false;
                                                }
                                                z4 = z3;
                                            }
                                            int i32 = n19;
                                            if (i32 == -1) {
                                                i13 = i30;
                                                z6 = false;
                                            } else {
                                                i13 = i30;
                                                if (((int) s0.getLong(i32)) != 0) {
                                                    z5 = true;
                                                } else {
                                                    z5 = false;
                                                }
                                                z6 = z5;
                                            }
                                            int i33 = n20;
                                            if (i33 == -1) {
                                                i14 = i31;
                                                i15 = i32;
                                                z8 = false;
                                            } else {
                                                i14 = i31;
                                                i15 = i32;
                                                if (((int) s0.getLong(i33)) != 0) {
                                                    z7 = true;
                                                } else {
                                                    z7 = false;
                                                }
                                                z8 = z7;
                                            }
                                            int i34 = n21;
                                            if (i34 == -1) {
                                                j7 = 0;
                                            } else {
                                                j7 = s0.getLong(i34);
                                            }
                                            int i35 = n22;
                                            if (i35 == -1) {
                                                j8 = 0;
                                            } else {
                                                j8 = s0.getLong(i35);
                                            }
                                            n21 = i34;
                                            int i36 = n23;
                                            if (i36 != -1) {
                                                qx0 qx0Var = new qx0(r, i28, z2, z4, z6, z8, j7, j8, gy5.a(s0.getBlob(i36)));
                                                Object Q = vn3.Q(s0.c0(J), so5Var);
                                                Q.getClass();
                                                List list = (List) Q;
                                                Object Q2 = vn3.Q(s0.c0(J), map2);
                                                Q2.getClass();
                                                arrayList.add(new y77(c03, k, U, j, j2, j3, qx0Var, i, h, j4, j5, i4, i6, j6, i9, list, c04, (List) Q2));
                                                n23 = i36;
                                                n22 = i35;
                                                n16 = i12;
                                                n = i2;
                                                n2 = i3;
                                                n18 = i14;
                                                i19 = i20;
                                                i18 = i21;
                                                map = map2;
                                                n4 = i27;
                                                n14 = i10;
                                                n17 = i13;
                                                n19 = i15;
                                                n20 = i33;
                                                n3 = i5;
                                                i17 = i7;
                                                n12 = i8;
                                                n13 = i24;
                                                n15 = i11;
                                            } else {
                                                throw new IllegalStateException("Missing value for a NON-NULL column 'content_uri_triggers', found NULL value instead.");
                                            }
                                        } else {
                                            throw new IllegalStateException("Missing value for a NON-NULL column 'required_network_request', found NULL value instead.");
                                        }
                                    } else {
                                        throw new IllegalStateException("Missing value for a NON-NULL column 'required_network_type', found NULL value instead.");
                                    }
                                } else {
                                    throw new IllegalStateException("Missing value for a NON-NULL column 'worker_class_name', found NULL value instead.");
                                }
                            } else {
                                throw new IllegalStateException("Missing value for a NON-NULL column 'backoff_policy', found NULL value instead.");
                            }
                        } else {
                            throw new IllegalStateException("Missing value for a NON-NULL column 'output', found NULL value instead.");
                        }
                    } else {
                        throw new IllegalStateException("Missing value for a NON-NULL column 'state', found NULL value instead.");
                    }
                } else {
                    throw new IllegalStateException("Missing value for a NON-NULL column 'id', found NULL value instead.");
                }
            }
            s0.close();
            return arrayList;
        } catch (Throwable th) {
            s0.close();
            throw th;
        }
    }

    public List<y77> getWorkInfoPojos(c36 c36Var) {
        c36Var.getClass();
        TreeMap treeMap = c75.E;
        c75 o = tl7.o(c36Var);
        String G = o.G();
        return (List) q23.J(this.__db, true, false, new my4(G, new b75(G, new pz3(o, (byte) 18)), this, (byte) 0));
    }

    public w42 getWorkInfoPojosFlow(c36 c36Var) {
        c36Var.getClass();
        TreeMap treeMap = c75.E;
        c75 o = tl7.o(c36Var);
        String G = o.G();
        return a34.M(this.__db, false, new String[]{"WorkTag", "WorkProgress", "WorkSpec"}, new my4(G, new b75(G, new pz3(o, (byte) 18)), this, (byte) 1));
    }

    public cj3 getWorkInfoPojosLiveData(c36 c36Var) {
        c36Var.getClass();
        TreeMap treeMap = c75.E;
        c75 o = tl7.o(c36Var);
        String G = o.G();
        return this.__db.getInvalidationTracker().b(new String[]{"WorkTag", "WorkProgress", "WorkSpec"}, false, new my4(G, new b75(G, new pz3(o, (byte) 18)), this, (byte) 2));
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
