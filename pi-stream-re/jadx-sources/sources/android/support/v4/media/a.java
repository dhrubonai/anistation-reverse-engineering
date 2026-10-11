package android.support.v4.media;

import a.e;
import android.os.Parcelable;
import androidx.appcompat.widget.u0;
import androidx.fragment.app.p0;
import androidx.fragment.app.y0;
import c.k;
import c1.a1;
import c1.o;
import c1.p;
import com.google.android.gms.dynamite.descriptors.com.google.firebase.auth.ModuleDescriptor;
import com.google.android.gms.internal.p002firebaseauthapi.zzaja;
import k0.l;
import p1.u;
import p1.v;

/* loaded from: classes.dex */
public final class a implements Parcelable.Creator {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f224a;

    public /* synthetic */ a(int i10) {
        this.f224a = i10;
    }

    /* JADX WARN: Removed duplicated region for block: B:73:0x0112  */
    @Override // android.os.Parcelable.Creator
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object createFromParcel(final android.os.Parcel r14) {
        /*
            Method dump skipped, instructions count: 374
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: android.support.v4.media.a.createFromParcel(android.os.Parcel):java.lang.Object");
    }

    @Override // android.os.Parcelable.Creator
    public final Object[] newArray(int i10) {
        switch (this.f224a) {
            case 0:
                return new MediaBrowserCompat$MediaItem[i10];
            case 1:
                return new MediaDescriptionCompat[i10];
            case 2:
                return new MediaMetadataCompat[i10];
            case 3:
                return new RatingCompat[i10];
            case 4:
                return new e[i10];
            case 5:
                return new c.a[i10];
            case 6:
                return new k[i10];
            case zzaja.zze.zzg /* 7 */:
                return new u0[i10];
            case 8:
                return new l[i10];
            case 9:
                return new androidx.fragment.app.b[i10];
            case 10:
                return new androidx.fragment.app.c[i10];
            case ModuleDescriptor.MODULE_VERSION /* 11 */:
                return new p0[i10];
            case 12:
                return new androidx.fragment.app.u0[i10];
            case 13:
                return new y0[i10];
            case 14:
                return new p[i10];
            case 15:
                return new o[i10];
            case 16:
                return new c1.p0[i10];
            case 17:
                return new a1[i10];
            case 18:
                return new g1.a[i10];
            case 19:
                return new g1.b[i10];
            case 20:
                return new g1.c[i10];
            case 21:
                return new v[i10];
            case 22:
                return new u[i10];
            case 23:
                return new m2.a[i10];
            case 24:
                return new n2.a[i10];
            case 25:
                return new o2.a[i10];
            case 26:
                return new o2.b[i10];
            case 27:
                return new p2.b[i10];
            case 28:
                return new p2.c[i10];
            default:
                return new q2.a[i10];
        }
    }
}
