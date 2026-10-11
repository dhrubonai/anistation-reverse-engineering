package androidx.profileinstaller;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.os.Build;
import android.os.Bundle;
import android.os.Process;
import com.bumptech.glide.d;
import f1.k;
import java.io.File;
import k.a;
import w1.o;

/* loaded from: classes.dex */
public class ProfileInstallReceiver extends BroadcastReceiver {
    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        Bundle extras;
        File codeCacheDir;
        Context createDeviceProtectedStorageContext;
        if (intent == null) {
            return;
        }
        String action = intent.getAction();
        if ("androidx.profileinstaller.action.INSTALL_PROFILE".equals(action)) {
            d.j0(context, new a(3), new k3.d(this, 0), true);
            return;
        }
        if ("androidx.profileinstaller.action.SKIP_FILE".equals(action)) {
            Bundle extras2 = intent.getExtras();
            if (extras2 != null) {
                String string = extras2.getString("EXTRA_SKIP_FILE_OPERATION");
                if ("WRITE_SKIP_FILE".equals(string)) {
                    k3.d dVar = new k3.d(this, 0);
                    try {
                        d.K(context.getPackageManager().getPackageInfo(context.getApplicationContext().getPackageName(), 0), context.getFilesDir());
                        new k(dVar, 10, (Object) null, 4).run();
                        return;
                    } catch (PackageManager.NameNotFoundException e10) {
                        new k(dVar, 7, e10, 4).run();
                        return;
                    }
                }
                if ("DELETE_SKIP_FILE".equals(string)) {
                    k3.d dVar2 = new k3.d(this, 0);
                    new File(context.getFilesDir(), "profileinstaller_profileWrittenFor_lastUpdateTime.dat").delete();
                    new k(dVar2, 11, (Object) null, 4).run();
                    return;
                }
                return;
            }
            return;
        }
        boolean equals = "androidx.profileinstaller.action.SAVE_PROFILE".equals(action);
        o oVar = d.f2194i;
        if (equals) {
            if (Build.VERSION.SDK_INT >= 24) {
                Process.sendSignal(Process.myPid(), 10);
                oVar.l(12, null);
                setResultCode(12);
                return;
            } else {
                oVar.l(13, null);
                setResultCode(13);
                return;
            }
        }
        if ("androidx.profileinstaller.action.BENCHMARK_OPERATION".equals(action) && (extras = intent.getExtras()) != null) {
            if ("DROP_SHADER_CACHE".equals(extras.getString("EXTRA_BENCHMARK_OPERATION"))) {
                if (Build.VERSION.SDK_INT >= 24) {
                    createDeviceProtectedStorageContext = context.createDeviceProtectedStorageContext();
                    codeCacheDir = createDeviceProtectedStorageContext.getCodeCacheDir();
                } else {
                    codeCacheDir = context.getCodeCacheDir();
                }
                if (j5.a.r(codeCacheDir)) {
                    oVar.l(14, null);
                    setResultCode(14);
                    return;
                } else {
                    oVar.l(15, null);
                    setResultCode(15);
                    return;
                }
            }
            oVar.l(16, null);
            setResultCode(16);
        }
    }
}
