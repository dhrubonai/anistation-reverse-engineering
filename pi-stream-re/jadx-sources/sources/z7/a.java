package z7;

import android.content.Intent;
import android.net.Uri;
import android.os.Build;
import android.os.Handler;
import android.util.Log;
import androidx.core.content.FileProvider;
import c9.i;
import com.google.android.gms.common.api.internal.i0;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import msr.pistream.app.ui.home.screens.MainActivity;
import y.m;
import y8.d0;
import y8.e0;
import y8.f0;
import y8.w;
import y8.y;

/* loaded from: classes.dex */
public abstract class a {

    /* renamed from: a, reason: collision with root package name */
    public static final ExecutorService f12081a = Executors.newSingleThreadExecutor();

    public static void a(String str, File file, z3.e eVar) {
        f0 f0Var;
        w p3 = c.p();
        y yVar = new y();
        yVar.d(str);
        yVar.b("Accept", "application/vnd.android.package-archive");
        yVar.b("User-Agent", "PiStream");
        yVar.c("GET", null);
        int i10 = 0;
        d0 c6 = new i(p3, yVar.a(), false).c();
        try {
            if (c6.f() && (f0Var = c6.f11697x) != null) {
                long j4 = ((e0) f0Var).f11705b;
                k9.f F = ((e0) f0Var).f11706c.F();
                try {
                    FileOutputStream fileOutputStream = new FileOutputStream(file, false);
                    try {
                        byte[] bArr = new byte[262144];
                        long j10 = 0;
                        long j11 = 0;
                        int i11 = -1;
                        while (true) {
                            int read = F.read(bArr);
                            if (read == -1) {
                                break;
                            }
                            fileOutputStream.write(bArr, i10, read);
                            j11 += read;
                            if (j4 > j10) {
                                int min = (int) Math.min(99L, (100 * j11) / j4);
                                if (min != i11) {
                                    if (eVar != null) {
                                        try {
                                            i0 i0Var = (i0) eVar.f12044b;
                                            ((Handler) i0Var.f2436f).post(new m(i0Var, min, 3));
                                        } catch (Exception unused) {
                                        }
                                    }
                                    String str2 = "Downloading… " + min + "%";
                                    if (eVar != null) {
                                        try {
                                            ((i0) eVar.f12044b).d(str2);
                                        } catch (Exception unused2) {
                                        }
                                    }
                                    i11 = min;
                                }
                                i10 = 0;
                                j10 = 0;
                            } else {
                                i10 = 0;
                            }
                        }
                        fileOutputStream.getFD().sync();
                        fileOutputStream.close();
                        F.close();
                        c6.close();
                        if (file.exists() && file.length() >= 1048576) {
                            return;
                        }
                        file.delete();
                        throw new IOException("file broken");
                    } finally {
                    }
                } finally {
                }
            } else {
                throw new IOException("HTTP " + c6.f11694d);
            }
        } finally {
        }
    }

    public static void b(z3.e eVar, String str) {
        if (eVar == null) {
            return;
        }
        try {
            ((i0) eVar.f12044b).c(false);
            ((i0) eVar.f12044b).d(str);
            ((i0) eVar.f12044b).a("Retry");
        } catch (Exception unused) {
        }
    }

    public static boolean c(MainActivity mainActivity, File file) {
        boolean canRequestPackageInstalls;
        try {
            if (Build.VERSION.SDK_INT >= 26) {
                try {
                    canRequestPackageInstalls = mainActivity.getPackageManager().canRequestPackageInstalls();
                    if (!canRequestPackageInstalls) {
                        try {
                            Intent intent = new Intent("android.settings.MANAGE_UNKNOWN_APP_SOURCES", Uri.parse("package:" + mainActivity.getPackageName()));
                            intent.addFlags(268435456);
                            mainActivity.startActivity(intent);
                        } catch (Exception e10) {
                            Log.e("ApkInstaller", "unknown-sources", e10);
                        }
                        return false;
                    }
                } catch (Exception unused) {
                }
            }
            Uri uriForFile = FileProvider.getUriForFile(mainActivity, mainActivity.getPackageName() + ".fileprovider", file);
            Intent intent2 = new Intent("android.intent.action.VIEW");
            intent2.setDataAndType(uriForFile, "application/vnd.android.package-archive");
            intent2.addFlags(268435457);
            mainActivity.startActivity(intent2);
            return true;
        } catch (Exception e11) {
            Log.e("ApkInstaller", "install", e11);
            return false;
        }
    }
}
