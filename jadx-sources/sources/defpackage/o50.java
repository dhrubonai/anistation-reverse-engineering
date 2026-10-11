package defpackage;

import android.content.Context;
import android.content.IntentFilter;
import java.util.LinkedHashSet;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public final class o50 {
    public final o77 a;
    public final Context b;
    public final Object c;
    public final LinkedHashSet d;
    public Object e;
    public final o9 f;
    public final /* synthetic */ byte g;

    public o50(Context context, o77 o77Var, byte b) {
        this.g = b;
        this.a = o77Var;
        Context applicationContext = context.getApplicationContext();
        applicationContext.getClass();
        this.b = applicationContext;
        this.c = new Object();
        this.d = new LinkedHashSet();
        this.f = new o9(this, (byte) 2);
    }

    public final IntentFilter a() {
        switch (this.g) {
            case 0:
                IntentFilter intentFilter = new IntentFilter();
                intentFilter.addAction("android.os.action.CHARGING");
                intentFilter.addAction("android.os.action.DISCHARGING");
                return intentFilter;
            case 1:
                IntentFilter intentFilter2 = new IntentFilter();
                intentFilter2.addAction("android.intent.action.BATTERY_OKAY");
                intentFilter2.addAction("android.intent.action.BATTERY_LOW");
                return intentFilter2;
            default:
                IntentFilter intentFilter3 = new IntentFilter();
                intentFilter3.addAction("android.intent.action.DEVICE_STORAGE_OK");
                intentFilter3.addAction("android.intent.action.DEVICE_STORAGE_LOW");
                return intentFilter3;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:14:0x003d, code lost:
    
        if (r9.equals("android.intent.action.DEVICE_STORAGE_OK") == false) goto L20;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Boolean b() {
        /*
            r9 = this;
            byte r0 = r9.g
            java.lang.String r1 = "status"
            java.lang.String r2 = "getInitialState - null intent received"
            java.lang.String r3 = "android.intent.action.BATTERY_CHANGED"
            r4 = -1
            r5 = 0
            android.content.Context r6 = r9.b
            r7 = 1
            r8 = 0
            switch(r0) {
                case 0: goto L86;
                case 1: goto L4c;
                default: goto L11;
            }
        L11:
            android.content.IntentFilter r9 = r9.a()
            android.content.Intent r9 = r6.registerReceiver(r5, r9)
            if (r9 == 0) goto L47
            java.lang.String r0 = r9.getAction()
            if (r0 != 0) goto L22
            goto L47
        L22:
            java.lang.String r9 = r9.getAction()
            if (r9 == 0) goto L46
            int r0 = r9.hashCode()
            r1 = -1181163412(0xffffffffb998e06c, float:-2.9158907E-4)
            if (r0 == r1) goto L40
            r1 = -730838620(0xffffffffd47049a4, float:-4.1281105E12)
            if (r0 == r1) goto L37
            goto L46
        L37:
            java.lang.String r0 = "android.intent.action.DEVICE_STORAGE_OK"
            boolean r9 = r9.equals(r0)
            if (r9 != 0) goto L47
            goto L46
        L40:
            java.lang.String r0 = "android.intent.action.DEVICE_STORAGE_LOW"
            boolean r9 = r9.equals(r0)
        L46:
            r7 = r8
        L47:
            java.lang.Boolean r9 = java.lang.Boolean.valueOf(r7)
            return r9
        L4c:
            android.content.IntentFilter r9 = new android.content.IntentFilter
            r9.<init>(r3)
            android.content.Intent r9 = r6.registerReceiver(r5, r9)
            if (r9 != 0) goto L63
            xk3 r9 = defpackage.xk3.d()
            java.lang.String r0 = defpackage.q50.a
            r9.b(r0, r2)
            java.lang.Boolean r9 = java.lang.Boolean.FALSE
            goto L85
        L63:
            int r0 = r9.getIntExtra(r1, r4)
            java.lang.String r1 = "level"
            int r1 = r9.getIntExtra(r1, r4)
            java.lang.String r2 = "scale"
            int r9 = r9.getIntExtra(r2, r4)
            float r1 = (float) r1
            float r9 = (float) r9
            float r1 = r1 / r9
            if (r0 == r7) goto L81
            r9 = 1041865114(0x3e19999a, float:0.15)
            int r9 = (r1 > r9 ? 1 : (r1 == r9 ? 0 : -1))
            if (r9 <= 0) goto L80
            goto L81
        L80:
            r7 = r8
        L81:
            java.lang.Boolean r9 = java.lang.Boolean.valueOf(r7)
        L85:
            return r9
        L86:
            android.content.IntentFilter r9 = new android.content.IntentFilter
            r9.<init>(r3)
            android.content.Intent r9 = r6.registerReceiver(r5, r9)
            if (r9 != 0) goto L9d
            xk3 r9 = defpackage.xk3.d()
            java.lang.String r0 = defpackage.p50.a
            r9.b(r0, r2)
            java.lang.Boolean r9 = java.lang.Boolean.FALSE
            goto Lad
        L9d:
            int r9 = r9.getIntExtra(r1, r4)
            r0 = 2
            if (r9 == r0) goto La9
            r0 = 5
            if (r9 != r0) goto La8
            goto La9
        La8:
            r7 = r8
        La9:
            java.lang.Boolean r9 = java.lang.Boolean.valueOf(r7)
        Lad:
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.o50.b():java.lang.Boolean");
    }

    public final void c(Boolean bool) {
        synchronized (this.c) {
            Object obj = this.e;
            if (obj != null && obj.equals(bool)) {
                return;
            }
            this.e = bool;
            this.a.e.execute(new gb(yo0.I0(this.d), this, (byte) 15));
        }
    }
}
