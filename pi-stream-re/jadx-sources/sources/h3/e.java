package h3;

import android.content.Context;
import android.net.Uri;
import android.util.Base64;
import c1.o1;
import c1.x0;
import com.google.android.gms.internal.p002firebaseauthapi.zzaja;
import com.google.firebase.FirebaseCommonRegistrar;
import com.google.firebase.platforminfo.LibraryVersionComponent;
import java.util.Map;

/* loaded from: classes.dex */
public final /* synthetic */ class e implements d2.s, m6.y, LibraryVersionComponent.VersionExtractor, q6.m, q6.f, f1.l, f1.c {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f4719a;

    public /* synthetic */ e(int i10) {
        this.f4719a = i10;
    }

    public d2.p[] a() {
        return new d2.p[]{new i3.d()};
    }

    @Override // f1.c
    public void accept(Object obj) {
        ((o1.n) obj).d(this.f4719a);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:101:0x02e8  */
    /* JADX WARN: Removed duplicated region for block: B:102:0x02d9  */
    /* JADX WARN: Removed duplicated region for block: B:103:0x02c8  */
    /* JADX WARN: Removed duplicated region for block: B:104:0x02b8  */
    /* JADX WARN: Removed duplicated region for block: B:105:0x02a7  */
    /* JADX WARN: Removed duplicated region for block: B:106:0x0296  */
    /* JADX WARN: Removed duplicated region for block: B:108:0x0264  */
    /* JADX WARN: Removed duplicated region for block: B:109:0x0253  */
    /* JADX WARN: Removed duplicated region for block: B:110:0x0243  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x023d  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x024c  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x025d  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x026e  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x028f  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x02a0  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x02b1  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x02c5  */
    /* JADX WARN: Removed duplicated region for block: B:95:0x02d2  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x02e3  */
    /* JADX WARN: Type inference failed for: r1v43 */
    /* JADX WARN: Type inference failed for: r1v44, types: [android.text.SpannableString, android.text.Spannable] */
    /* JADX WARN: Type inference failed for: r1v9, types: [java.lang.CharSequence] */
    @Override // q6.f
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object apply(java.lang.Object r27) {
        /*
            Method dump skipped, instructions count: 928
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: h3.e.apply(java.lang.Object):java.lang.Object");
    }

    @Override // d2.s
    public d2.p[] d(Uri uri, Map map) {
        return a();
    }

    @Override // com.google.firebase.platforminfo.LibraryVersionComponent.VersionExtractor
    public String extract(Object obj) {
        switch (this.f4719a) {
            case 5:
                return FirebaseCommonRegistrar.b((Context) obj);
            case 6:
                return FirebaseCommonRegistrar.c((Context) obj);
            case zzaja.zze.zzg /* 7 */:
                return FirebaseCommonRegistrar.d((Context) obj);
            default:
                return FirebaseCommonRegistrar.a((Context) obj);
        }
    }

    @Override // q6.m
    public Object get() {
        switch (this.f4719a) {
            case 0:
                return new j1.i();
            case 1:
                byte[] bArr = new byte[12];
                k1.c0.f6340i.nextBytes(bArr);
                return Base64.encodeToString(bArr, 10);
            case 2:
                int i10 = b2.a.f1288a;
                try {
                    Class<?> cls = Class.forName("androidx.media3.effect.DefaultVideoFrameProcessor$Factory$Builder");
                    Object invoke = cls.getMethod("build", new Class[0]).invoke(cls.getConstructor(new Class[0]).newInstance(new Object[0]), new Object[0]);
                    invoke.getClass();
                    return (o1) invoke;
                } catch (Exception e10) {
                    throw new IllegalStateException(e10);
                }
            default:
                throw new IllegalStateException();
        }
    }

    @Override // f1.l
    public void invoke(Object obj) {
        ((x0) obj).k(this.f4719a);
    }
}
