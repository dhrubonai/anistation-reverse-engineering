package b5;

import android.app.PendingIntent;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.api.y;
import com.google.android.gms.dynamite.descriptors.com.google.firebase.auth.ModuleDescriptor;
import com.google.android.gms.internal.p002firebaseauthapi.zzaja;
import java.util.Arrays;
import p7.a0;

/* loaded from: classes.dex */
public final class a extends c5.a {

    /* renamed from: a, reason: collision with root package name */
    public final int f1506a;

    /* renamed from: b, reason: collision with root package name */
    public final int f1507b;

    /* renamed from: c, reason: collision with root package name */
    public final PendingIntent f1508c;

    /* renamed from: d, reason: collision with root package name */
    public final String f1509d;

    /* renamed from: e, reason: collision with root package name */
    public static final a f1505e = new a(0);
    public static final Parcelable.Creator<a> CREATOR = new y(17);

    public a(int i10, int i11, PendingIntent pendingIntent, String str) {
        this.f1506a = i10;
        this.f1507b = i11;
        this.f1508c = pendingIntent;
        this.f1509d = str;
    }

    public static String d(int i10) {
        if (i10 != 99) {
            if (i10 != 1500) {
                switch (i10) {
                    case -1:
                        return "UNKNOWN";
                    case 0:
                        return "SUCCESS";
                    case 1:
                        return "SERVICE_MISSING";
                    case 2:
                        return "SERVICE_VERSION_UPDATE_REQUIRED";
                    case 3:
                        return "SERVICE_DISABLED";
                    case 4:
                        return "SIGN_IN_REQUIRED";
                    case 5:
                        return "INVALID_ACCOUNT";
                    case 6:
                        return "RESOLUTION_REQUIRED";
                    case zzaja.zze.zzg /* 7 */:
                        return "NETWORK_ERROR";
                    case 8:
                        return "INTERNAL_ERROR";
                    case 9:
                        return "SERVICE_INVALID";
                    case 10:
                        return "DEVELOPER_ERROR";
                    case ModuleDescriptor.MODULE_VERSION /* 11 */:
                        return "LICENSE_CHECK_FAILED";
                    default:
                        switch (i10) {
                            case 13:
                                return "CANCELED";
                            case 14:
                                return "TIMEOUT";
                            case 15:
                                return "INTERRUPTED";
                            case 16:
                                return "API_UNAVAILABLE";
                            case 17:
                                return "SIGN_IN_FAILED";
                            case 18:
                                return "SERVICE_UPDATING";
                            case 19:
                                return "SERVICE_MISSING_PERMISSION";
                            case 20:
                                return "RESTRICTED_PROFILE";
                            case 21:
                                return "API_VERSION_UPDATE_REQUIRED";
                            case 22:
                                return "RESOLUTION_ACTIVITY_NOT_FOUND";
                            case 23:
                                return "API_DISABLED";
                            case 24:
                                return "API_DISABLED_FOR_CONNECTION";
                            default:
                                return a3.g.o("UNKNOWN_ERROR_CODE(", i10, ")");
                        }
                }
            }
            return "DRIVE_EXTERNAL_STORAGE_REQUIRED";
        }
        return "UNFINISHED";
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        if (this.f1507b == aVar.f1507b && a0.q(this.f1508c, aVar.f1508c) && a0.q(this.f1509d, aVar.f1509d)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(this.f1507b), this.f1508c, this.f1509d});
    }

    public final String toString() {
        z3.e eVar = new z3.e(this);
        eVar.f(d(this.f1507b), "statusCode");
        eVar.f(this.f1508c, "resolution");
        eVar.f(this.f1509d, "message");
        return eVar.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        int t02 = a0.t0(20293, parcel);
        a0.h0(parcel, 1, this.f1506a);
        a0.h0(parcel, 2, this.f1507b);
        a0.m0(parcel, 3, this.f1508c, i10, false);
        a0.n0(parcel, 4, this.f1509d, false);
        a0.u0(t02, parcel);
    }

    public a(int i10) {
        this(1, i10, null, null);
    }

    public a(int i10, PendingIntent pendingIntent) {
        this(1, i10, pendingIntent, null);
    }
}
