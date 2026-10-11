package defpackage;

import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageInfo;
import android.os.Binder;
import android.os.Build;
import android.os.Process;
import java.util.concurrent.ConcurrentHashMap;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public final class t91 implements gp3 {
    public final Context x;

    public t91(Context context) {
        boolean z;
        new ConcurrentHashMap();
        if (context != null) {
            z = true;
        } else {
            z = false;
        }
        xt5.j(z, "Context cannot be null", new Object[0]);
        this.x = context.getApplicationContext();
    }

    public ApplicationInfo a(int i, String str) {
        return this.x.getPackageManager().getApplicationInfo(str, i);
    }

    @Override // defpackage.gp3
    public hp3 b(tp tpVar) {
        Context context;
        if (Build.VERSION.SDK_INT >= 31 || ((context = this.x) != null && context.getPackageManager().hasSystemFeature("com.amazon.hardware.tv_screen"))) {
            int h = qy3.h(((ea2) tpVar.A).p);
            kb0.B("DMCodecAdapterFactory", "Creating an asynchronous MediaCodec adapter for track type ".concat(eq6.J(h)));
            u98 u98Var = new u98(new du(h, (byte) 0), new du(h, (byte) 1));
            u98Var.y = true;
            return u98Var.b(tpVar);
        }
        return new z95((byte) 4).b(tpVar);
    }

    public PackageInfo c(int i, String str) {
        return this.x.getPackageManager().getPackageInfo(str, i);
    }

    public boolean d() {
        int callingUid = Binder.getCallingUid();
        int myUid = Process.myUid();
        Context context = this.x;
        if (callingUid == myUid) {
            return n03.z(context);
        }
        String nameForUid = context.getPackageManager().getNameForUid(Binder.getCallingUid());
        if (nameForUid != null) {
            return context.getPackageManager().isInstantApp(nameForUid);
        }
        return false;
    }
}
