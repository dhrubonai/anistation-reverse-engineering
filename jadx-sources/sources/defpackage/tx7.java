package defpackage;

import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import java.util.ArrayList;
import java.util.Collections;
import java.util.concurrent.ConcurrentHashMap;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public final /* synthetic */ class tx7 implements r26 {
    public final /* synthetic */ byte x;
    public final /* synthetic */ Context y;

    public /* synthetic */ tx7(Context context, byte b) {
        this.x = b;
        this.y = context;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v2, types: [ww7, ph2] */
    @Override // defpackage.r26
    public final Object get() {
        byte b = this.x;
        Context context = this.y;
        switch (b) {
            case 0:
                Object obj = sx7.j;
                final tp tpVar = new tp((byte) 12);
                tpVar.y = context;
                context.getClass();
                if (((r26) tpVar.z) == null) {
                    tpVar.z = sx7.m;
                }
                final byte b2 = 1;
                if (((r26) tpVar.A) == null) {
                    tpVar.A = mv5.e(new tx7((Context) tpVar.y, b2));
                }
                if (((px7) tpVar.B) == null) {
                    tpVar.B = new r26() { // from class: px7
                        @Override // defpackage.r26
                        public final Object get() {
                            byte b3 = b2;
                            tp tpVar2 = tpVar;
                            switch (b3) {
                                case 0:
                                    Context context2 = (Context) tpVar2.y;
                                    Object obj2 = sx7.j;
                                    try {
                                        ApplicationInfo applicationInfo = context2.getPackageManager().getApplicationInfo("com.google.android.gms", 0);
                                        applicationInfo.getClass();
                                        return new ht4(applicationInfo);
                                    } catch (PackageManager.NameNotFoundException unused) {
                                        return v.x;
                                    }
                                default:
                                    return new ht4(new c38((r26) tpVar2.z));
                            }
                        }
                    };
                }
                final byte b3 = 0;
                if (((r26) tpVar.C) == null) {
                    Context context2 = (Context) tpVar.y;
                    ArrayList arrayList = new ArrayList();
                    x48 x48Var = new x48(new t91(context2));
                    new ConcurrentHashMap();
                    Collections.addAll(arrayList, x48Var, new Object());
                    tpVar.C = mv5.e(new wx7(arrayList, b3));
                }
                if (((px7) tpVar.D) == null) {
                    tpVar.D = new r26() { // from class: px7
                        @Override // defpackage.r26
                        public final Object get() {
                            byte b32 = b3;
                            tp tpVar2 = tpVar;
                            switch (b32) {
                                case 0:
                                    Context context22 = (Context) tpVar2.y;
                                    Object obj2 = sx7.j;
                                    try {
                                        ApplicationInfo applicationInfo = context22.getPackageManager().getApplicationInfo("com.google.android.gms", 0);
                                        applicationInfo.getClass();
                                        return new ht4(applicationInfo);
                                    } catch (PackageManager.NameNotFoundException unused) {
                                        return v.x;
                                    }
                                default:
                                    return new ht4(new c38((r26) tpVar2.z));
                            }
                        }
                    };
                }
                return new sx7((Context) tpVar.y, (r26) tpVar.z, (r26) tpVar.A, (px7) tpVar.B, (r26) tpVar.C, (px7) tpVar.D);
            case 1:
                Object obj2 = sx7.j;
                return new fz7(new ph2(context, iw7.a, qo.a, oh2.c));
            default:
                Object obj3 = fy7.a;
                return nx7.W(context);
        }
    }
}
