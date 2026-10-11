package k3;

import android.os.Parcel;
import android.util.Base64;
import android.util.Log;
import android.view.View;
import androidx.appcompat.widget.k4;
import androidx.profileinstaller.ProfileInstallReceiver;
import b4.c0;
import b4.y;
import com.google.android.gms.auth.api.signin.internal.SignInHubActivity;
import com.google.android.gms.common.api.internal.p;
import com.google.android.gms.common.api.internal.s;
import com.google.android.gms.dynamite.descriptors.com.google.firebase.auth.ModuleDescriptor;
import com.google.android.gms.internal.base.zac;
import com.google.android.gms.tasks.TaskCompletionSource;
import com.google.android.material.behavior.SwipeDismissBehavior;
import com.google.android.material.button.MaterialButtonToggleGroup;
import com.google.android.material.sidesheet.SideSheetBehavior;
import dagger.hilt.android.internal.managers.ComponentSupplier;
import dagger.hilt.android.internal.modules.ApplicationContextModule;
import g0.i0;
import g0.y0;
import h0.u;
import java.io.ByteArrayInputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.WeakHashMap;
import x3.v;
import x3.x;

/* loaded from: classes.dex */
public final class d implements e, q4.a, b4.d, y, v3.c, com.google.android.gms.common.internal.d, s, com.google.android.gms.common.internal.b, com.google.android.gms.common.internal.c, u, x5.a, ComponentSupplier {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f6452a;

    /* renamed from: b, reason: collision with root package name */
    public Object f6453b;

    public /* synthetic */ d(SignInHubActivity signInHubActivity) {
        this.f6452a = 15;
        this.f6453b = signInHubActivity;
    }

    public static ByteArrayInputStream c(String str) {
        if (str.startsWith("data:image")) {
            int indexOf = str.indexOf(44);
            if (indexOf != -1) {
                if (str.substring(0, indexOf).endsWith(";base64")) {
                    return new ByteArrayInputStream(Base64.decode(str.substring(indexOf + 1), 0));
                }
                throw new IllegalArgumentException("Not a base64 image data URL.");
            }
            throw new IllegalArgumentException("Missing comma in data URL.");
        }
        throw new IllegalArgumentException("Not a valid image data URL.");
    }

    @Override // h0.u
    public final boolean a(View view) {
        boolean z9;
        boolean z10 = false;
        if (!((SwipeDismissBehavior) this.f6453b).r(view)) {
            return false;
        }
        WeakHashMap weakHashMap = y0.f4277a;
        if (i0.d(view) == 1) {
            z9 = true;
        } else {
            z9 = false;
        }
        int i10 = ((SwipeDismissBehavior) this.f6453b).f2646d;
        if ((i10 == 0 && z9) || (i10 == 1 && !z9)) {
            z10 = true;
        }
        int width = view.getWidth();
        if (z10) {
            width = -width;
        }
        view.offsetLeftAndRight(width);
        view.setAlpha(0.0f);
        ((SwipeDismissBehavior) this.f6453b).getClass();
        return true;
    }

    @Override // com.google.android.gms.common.api.internal.s
    public final void accept(Object obj, Object obj2) {
        com.google.android.gms.common.internal.u uVar = (com.google.android.gms.common.internal.u) this.f6453b;
        d5.a aVar = (d5.a) ((d5.c) obj).getService();
        Parcel zaa = aVar.zaa();
        zac.zac(zaa, uVar);
        aVar.zad(1, zaa);
        ((TaskCompletionSource) obj2).setResult(null);
    }

    @Override // com.google.android.gms.common.internal.d
    public final void b(b5.a aVar) {
        boolean z9;
        if (aVar.f1507b == 0) {
            z9 = true;
        } else {
            z9 = false;
        }
        if (z9) {
            com.google.android.gms.common.internal.f fVar = (com.google.android.gms.common.internal.f) this.f6453b;
            fVar.getRemoteService(null, fVar.getScopes());
        } else if (com.google.android.gms.common.internal.f.zzc((com.google.android.gms.common.internal.f) this.f6453b) != null) {
            ((p) ((d) com.google.android.gms.common.internal.f.zzc((com.google.android.gms.common.internal.f) this.f6453b)).f6453b).c(aVar);
        }
    }

    public final int d() {
        int e10 = e();
        Object obj = this.f6453b;
        return Math.max(0, (e10 - ((SideSheetBehavior) obj).f2786l) - ((SideSheetBehavior) obj).f2788n);
    }

    public final int e() {
        return ((SideSheetBehavior) this.f6453b).f2787m;
    }

    @Override // q4.a
    public final Object g() {
        switch (this.f6452a) {
            case 4:
                y.c cVar = (y.c) this.f6453b;
                return new x3.l((x3.p) cVar.f11424b, (f0.c) cVar.f11425c);
            case 5:
                k4 k4Var = (k4) this.f6453b;
                return new x3.u((a4.c) k4Var.f551a, (a4.c) k4Var.f552b, (a4.c) k4Var.f553c, (a4.c) k4Var.f554d, (v) k4Var.f555e, (x) k4Var.f556f, (f0.c) k4Var.f557g);
            default:
                try {
                    return new z3.j(MessageDigest.getInstance("SHA-256"));
                } catch (NoSuchAlgorithmException e10) {
                    throw new RuntimeException(e10);
                }
        }
    }

    @Override // dagger.hilt.android.internal.managers.ComponentSupplier
    public final Object get() {
        d dVar = new d((c) null);
        ApplicationContextModule applicationContextModule = new ApplicationContextModule((x7.k) this.f6453b);
        dVar.f6453b = applicationContextModule;
        return new x7.g(applicationContextModule);
    }

    @Override // k3.e
    public final void i() {
        Log.d("ProfileInstaller", "DIAGNOSTIC_PROFILE_IS_COMPRESSED");
    }

    @Override // b4.y
    public final b4.x j(c0 c0Var) {
        switch (this.f6452a) {
            case ModuleDescriptor.MODULE_VERSION /* 11 */:
                return new b4.f((d) this.f6453b, 1);
            default:
                return new c4.a((d) this.f6453b);
        }
    }

    @Override // k3.e
    public final void l(int i10, Object obj) {
        com.bumptech.glide.d.f2194i.l(i10, obj);
        ((ProfileInstallReceiver) this.f6453b).setResultCode(i10);
    }

    @Override // v3.c
    public final boolean p(Object obj, File file, v3.l lVar) {
        FileOutputStream fileOutputStream;
        InputStream inputStream = (InputStream) obj;
        byte[] bArr = (byte[]) ((y3.h) this.f6453b).d(65536, byte[].class);
        FileOutputStream fileOutputStream2 = null;
        try {
            try {
                fileOutputStream = new FileOutputStream(file);
                while (true) {
                    try {
                        int read = inputStream.read(bArr);
                        if (read == -1) {
                            break;
                        }
                        fileOutputStream.write(bArr, 0, read);
                    } catch (IOException e10) {
                        e = e10;
                        fileOutputStream2 = fileOutputStream;
                        if (Log.isLoggable("StreamEncoder", 3)) {
                            Log.d("StreamEncoder", "Failed to encode data onto the OutputStream", e);
                        }
                        if (fileOutputStream2 != null) {
                            try {
                                fileOutputStream2.close();
                            } catch (IOException unused) {
                            }
                        }
                        ((y3.h) this.f6453b).h(bArr);
                        return false;
                    } catch (Throwable th) {
                        th = th;
                        if (fileOutputStream != null) {
                            try {
                                fileOutputStream.close();
                            } catch (IOException unused2) {
                            }
                        }
                        ((y3.h) this.f6453b).h(bArr);
                        throw th;
                    }
                }
                fileOutputStream.close();
                try {
                    fileOutputStream.close();
                } catch (IOException unused3) {
                }
                ((y3.h) this.f6453b).h(bArr);
                return true;
            } catch (IOException e11) {
                e = e11;
            }
        } catch (Throwable th2) {
            th = th2;
            fileOutputStream = fileOutputStream2;
        }
    }

    public d(SideSheetBehavior sideSheetBehavior) {
        this.f6452a = 25;
        this.f6453b = sideSheetBehavior;
    }

    public /* synthetic */ d(Object obj, int i10) {
        this.f6452a = i10;
        this.f6453b = obj;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ d(c cVar) {
        this(28);
        this.f6452a = 28;
    }

    public d(a3.g gVar) {
        this.f6452a = 12;
        this.f6453b = new z3.g(this);
    }

    public d(int i10) {
        this.f6452a = i10;
        if (i10 == 14) {
            this.f6453b = new d((a3.g) null);
        } else if (i10 != 28) {
            this.f6453b = new d(this, 10);
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ d(MaterialButtonToggleGroup materialButtonToggleGroup) {
        this(materialButtonToggleGroup, 21);
        this.f6452a = 21;
    }

    public d(SwipeDismissBehavior swipeDismissBehavior) {
        this.f6452a = 26;
        swipeDismissBehavior.getClass();
        swipeDismissBehavior.f2648f = Math.min(Math.max(0.0f, 0.1f), 1.0f);
        swipeDismissBehavior.f2649g = Math.min(Math.max(0.0f, 0.6f), 1.0f);
        swipeDismissBehavior.f2646d = 0;
    }
}
