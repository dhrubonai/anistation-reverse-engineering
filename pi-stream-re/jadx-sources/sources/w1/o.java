package w1;

import android.graphics.Path;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.Log;
import android.view.View;
import androidx.appcompat.widget.a0;
import b2.g0;
import b4.c0;
import b4.x;
import b4.y;
import c1.v;
import com.google.android.gms.dynamite.descriptors.com.google.firebase.auth.ModuleDescriptor;
import com.google.android.gms.internal.p002firebaseauthapi.zzaja;
import java.io.File;
import java.io.IOException;
import java.lang.reflect.Field;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.NoSuchElementException;
import java.util.Objects;
import r6.o0;
import x3.d0;

/* loaded from: classes.dex */
public class o implements p, z1.p, z1.l, g0, d2.f, y2.k, k3.e, q4.a, z3.a, a4.b, y, v3.c {

    /* renamed from: b, reason: collision with root package name */
    public static Field f10789b;

    /* renamed from: c, reason: collision with root package name */
    public static boolean f10790c;

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f10791a;

    public /* synthetic */ o(int i10) {
        this.f10791a = i10;
    }

    public static byte[] s(long j4, o0 o0Var) {
        h3.e eVar = new h3.e(9);
        ArrayList<? extends Parcelable> arrayList = new ArrayList<>(o0Var.size());
        Iterator<E> it = o0Var.iterator();
        while (it.hasNext()) {
            arrayList.add((Bundle) eVar.apply(it.next()));
        }
        Bundle bundle = new Bundle();
        bundle.putParcelableArrayList("c", arrayList);
        bundle.putLong("d", j4);
        Parcel obtain = Parcel.obtain();
        obtain.writeBundle(bundle);
        byte[] marshall = obtain.marshall();
        obtain.recycle();
        return marshall;
    }

    public static Path u(float f10, float f11, float f12, float f13) {
        Path path = new Path();
        path.moveTo(f10, f11);
        path.lineTo(f12, f13);
        return path;
    }

    @Override // w1.p
    public final long a() {
        throw new NoSuchElementException();
    }

    @Override // z1.p
    public final void b() {
    }

    @Override // z1.l
    public final void c() {
        synchronized (a2.b.f32a) {
            Object obj = a2.b.f33b;
            synchronized (obj) {
                try {
                    if (a2.b.f34c) {
                        return;
                    }
                    long a10 = a2.b.a();
                    synchronized (obj) {
                        a2.b.f35d = a10;
                        a2.b.f34c = true;
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
    }

    @Override // b2.g0
    public final void d() {
    }

    @Override // b2.g0
    public final void e() {
    }

    @Override // d2.f
    public final long f(long j4) {
        return j4;
    }

    @Override // q4.a
    public final Object g() {
        return new d0();
    }

    @Override // z3.a
    public final void h(v3.i iVar, x3.k kVar) {
    }

    @Override // k3.e
    public final void i() {
        switch (this.f10791a) {
            case 9:
                return;
            default:
                Log.d("ProfileInstaller", "DIAGNOSTIC_PROFILE_IS_COMPRESSED");
                return;
        }
    }

    @Override // b4.y
    public final x j(c0 c0Var) {
        int i10 = 0;
        switch (this.f10791a) {
            case 27:
                return new b4.f(new k3.d(this, 8), i10);
            default:
                return new b4.f(new k3.d(this, 9), i10);
        }
    }

    @Override // w1.p
    public final long k() {
        throw new NoSuchElementException();
    }

    @Override // k3.e
    public final void l(int i10, Object obj) {
        String str;
        switch (this.f10791a) {
            case 9:
                return;
            default:
                switch (i10) {
                    case 1:
                        str = "RESULT_INSTALL_SUCCESS";
                        break;
                    case 2:
                        str = "RESULT_ALREADY_INSTALLED";
                        break;
                    case 3:
                        str = "RESULT_UNSUPPORTED_ART_VERSION";
                        break;
                    case 4:
                        str = "RESULT_NOT_WRITABLE";
                        break;
                    case 5:
                        str = "RESULT_DESIRED_FORMAT_UNSUPPORTED";
                        break;
                    case 6:
                        str = "RESULT_BASELINE_PROFILE_NOT_FOUND";
                        break;
                    case zzaja.zze.zzg /* 7 */:
                        str = "RESULT_IO_EXCEPTION";
                        break;
                    case 8:
                        str = "RESULT_PARSE_EXCEPTION";
                        break;
                    case 9:
                    default:
                        str = "";
                        break;
                    case 10:
                        str = "RESULT_INSTALL_SKIP_FILE_SUCCESS";
                        break;
                    case ModuleDescriptor.MODULE_VERSION /* 11 */:
                        str = "RESULT_DELETE_SKIP_FILE_SUCCESS";
                        break;
                }
                if (i10 != 6 && i10 != 7 && i10 != 8) {
                    Log.d("ProfileInstaller", str);
                    return;
                } else {
                    Log.e("ProfileInstaller", str, (Throwable) obj);
                    return;
                }
        }
    }

    @Override // z1.l
    public final void m() {
    }

    @Override // z3.a
    public final File n(v3.i iVar) {
        return null;
    }

    @Override // w1.p
    public final boolean next() {
        return false;
    }

    @Override // b2.g0
    public final void o() {
    }

    @Override // v3.c
    public final boolean p(Object obj, File file, v3.l lVar) {
        try {
            p4.b.d((ByteBuffer) obj, file);
            return true;
        } catch (IOException e10) {
            if (Log.isLoggable("ByteBufferEncoder", 3)) {
                Log.d("ByteBufferEncoder", "Failed to write data", e10);
            }
            return false;
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to find 'out' block for switch in B:11:0x0071. Please report as an issue. */
    public final y2.l r(v vVar) {
        char c6;
        y2.l iVar;
        switch (this.f10791a) {
            case zzaja.zze.zzg /* 7 */:
                String str = vVar.f1935m;
                if (str != null) {
                    switch (str.hashCode()) {
                        case -1351681404:
                            if (str.equals("application/dvbsubs")) {
                                c6 = 0;
                                break;
                            }
                            c6 = 65535;
                            break;
                        case -1248334819:
                            if (str.equals("application/pgs")) {
                                c6 = 1;
                                break;
                            }
                            c6 = 65535;
                            break;
                        case -1026075066:
                            if (str.equals("application/x-mp4-vtt")) {
                                c6 = 2;
                                break;
                            }
                            c6 = 65535;
                            break;
                        case -1004728940:
                            if (str.equals("text/vtt")) {
                                c6 = 3;
                                break;
                            }
                            c6 = 65535;
                            break;
                        case 691401887:
                            if (str.equals("application/x-quicktime-tx3g")) {
                                c6 = 4;
                                break;
                            }
                            c6 = 65535;
                            break;
                        case 822864842:
                            if (str.equals("text/x-ssa")) {
                                c6 = 5;
                                break;
                            }
                            c6 = 65535;
                            break;
                        case 1668750253:
                            if (str.equals("application/x-subrip")) {
                                c6 = 6;
                                break;
                            }
                            c6 = 65535;
                            break;
                        case 1693976202:
                            if (str.equals("application/ttml+xml")) {
                                c6 = 7;
                                break;
                            }
                            c6 = 65535;
                            break;
                        default:
                            c6 = 65535;
                            break;
                    }
                    List list = vVar.o;
                    switch (c6) {
                        case 0:
                            iVar = new a3.i(list);
                            return iVar;
                        case 1:
                            return new i.g(7);
                        case 2:
                            return new d2.y(1);
                        case 3:
                            return new a0(17);
                        case 4:
                            iVar = new f3.a(list);
                            return iVar;
                        case 5:
                            iVar = new c3.a(list);
                            return iVar;
                        case 6:
                            return new d3.a();
                        case zzaja.zze.zzg /* 7 */:
                            return new e3.e();
                    }
                }
                throw new IllegalArgumentException(r.f.d("Unsupported MIME type: ", str));
            default:
                throw new IllegalStateException("This SubtitleParser.Factory doesn't support any formats.");
        }
    }

    public final int t(v vVar) {
        switch (this.f10791a) {
            case zzaja.zze.zzg /* 7 */:
                String str = vVar.f1935m;
                if (str != null) {
                    str.hashCode();
                    char c6 = 65535;
                    switch (str.hashCode()) {
                        case -1351681404:
                            if (str.equals("application/dvbsubs")) {
                                c6 = 0;
                                break;
                            }
                            break;
                        case -1248334819:
                            if (str.equals("application/pgs")) {
                                c6 = 1;
                                break;
                            }
                            break;
                        case -1026075066:
                            if (str.equals("application/x-mp4-vtt")) {
                                c6 = 2;
                                break;
                            }
                            break;
                        case -1004728940:
                            if (str.equals("text/vtt")) {
                                c6 = 3;
                                break;
                            }
                            break;
                        case 691401887:
                            if (str.equals("application/x-quicktime-tx3g")) {
                                c6 = 4;
                                break;
                            }
                            break;
                        case 822864842:
                            if (str.equals("text/x-ssa")) {
                                c6 = 5;
                                break;
                            }
                            break;
                        case 1668750253:
                            if (str.equals("application/x-subrip")) {
                                c6 = 6;
                                break;
                            }
                            break;
                        case 1693976202:
                            if (str.equals("application/ttml+xml")) {
                                c6 = 7;
                                break;
                            }
                            break;
                    }
                    switch (c6) {
                        case 0:
                        case 1:
                        case 2:
                        case 4:
                            return 2;
                        case 3:
                        case 5:
                        case 6:
                        case zzaja.zze.zzg /* 7 */:
                            return 1;
                    }
                }
                throw new IllegalArgumentException(r.f.d("Unsupported MIME type: ", str));
            default:
                return 1;
        }
    }

    public void v(View view, int i10) {
        if (!f10790c) {
            try {
                Field declaredField = View.class.getDeclaredField("mViewFlags");
                f10789b = declaredField;
                declaredField.setAccessible(true);
            } catch (NoSuchFieldException unused) {
                Log.i("ViewUtilsBase", "fetchViewFlagsField: ");
            }
            f10790c = true;
        }
        Field field = f10789b;
        if (field != null) {
            try {
                f10789b.setInt(view, i10 | (field.getInt(view) & (-13)));
            } catch (IllegalAccessException unused2) {
            }
        }
    }

    public final boolean w(v vVar) {
        switch (this.f10791a) {
            case zzaja.zze.zzg /* 7 */:
                String str = vVar.f1935m;
                if (!Objects.equals(str, "text/x-ssa") && !Objects.equals(str, "text/vtt") && !Objects.equals(str, "application/x-mp4-vtt") && !Objects.equals(str, "application/x-subrip") && !Objects.equals(str, "application/x-quicktime-tx3g") && !Objects.equals(str, "application/pgs") && !Objects.equals(str, "application/dvbsubs") && !Objects.equals(str, "application/ttml+xml")) {
                    return false;
                }
                return true;
            default:
                return false;
        }
    }

    public o() {
        this.f10791a = 15;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ o(Object obj) {
        this(2);
        this.f10791a = 2;
    }
}
