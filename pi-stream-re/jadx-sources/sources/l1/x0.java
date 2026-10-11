package l1;

import com.google.android.gms.dynamite.descriptors.com.google.firebase.auth.ModuleDescriptor;
import com.google.android.gms.internal.p002firebaseauthapi.zzaja;

/* loaded from: classes.dex */
public final class x0 implements l0 {

    /* renamed from: b, reason: collision with root package name */
    public final int f6790b;

    /* renamed from: c, reason: collision with root package name */
    public final int f6791c;

    /* renamed from: d, reason: collision with root package name */
    public final int f6792d;

    /* renamed from: e, reason: collision with root package name */
    public final int f6793e;

    /* renamed from: f, reason: collision with root package name */
    public final int f6794f;

    /* renamed from: g, reason: collision with root package name */
    public final int f6795g;

    /* renamed from: h, reason: collision with root package name */
    public final int f6796h;

    public x0() {
        this.f6790b = 250000;
        this.f6791c = 750000;
        this.f6792d = 4;
        this.f6793e = 250000;
        this.f6794f = 50000000;
        this.f6795g = 2;
        this.f6796h = 4;
    }

    public static int a(int i10) {
        switch (i10) {
            case 5:
                return 80000;
            case 6:
            case 18:
                return 768000;
            case zzaja.zze.zzg /* 7 */:
                return 192000;
            case 8:
                return 2250000;
            case 9:
                return 40000;
            case 10:
                return 100000;
            case ModuleDescriptor.MODULE_VERSION /* 11 */:
                return 16000;
            case 12:
                return 7000;
            case 13:
            case 19:
            default:
                throw new IllegalArgumentException();
            case 14:
                return 3062500;
            case 15:
                return 8000;
            case 16:
                return 256000;
            case 17:
                return 336000;
            case 20:
                return 63750;
        }
    }

    public x0(x0 x0Var) {
        this.f6790b = x0Var.f6790b;
        this.f6791c = x0Var.f6791c;
        this.f6792d = x0Var.f6792d;
        this.f6793e = x0Var.f6793e;
        this.f6794f = x0Var.f6794f;
        this.f6795g = x0Var.f6795g;
        this.f6796h = x0Var.f6796h;
    }
}
