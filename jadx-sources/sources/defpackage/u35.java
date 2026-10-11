package defpackage;

import android.os.Parcel;
import android.os.Parcelable;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public final class u35 implements Parcelable {
    public static final Parcelable.Creator<u35> CREATOR = new hc7(29);
    public final int x;

    public u35(int i) {
        this.x = (i & 2) != 0 ? i | 1 : i;
    }

    /* JADX WARN: Code restructure failed: missing block: B:13:0x0032, code lost:
    
        if (r4.hasCapability(16) != false) goto L15;
     */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0068  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final int a(android.content.Context r8) {
        /*
            r7 = this;
            int r7 = r7.x
            r0 = r7 & 1
            r1 = 2
            r2 = 16
            r3 = 0
            if (r0 == 0) goto L42
            java.lang.String r0 = "connectivity"
            java.lang.Object r0 = r8.getSystemService(r0)
            r0.getClass()
            android.net.ConnectivityManager r0 = (android.net.ConnectivityManager) r0
            android.net.NetworkInfo r4 = r0.getActiveNetworkInfo()
            if (r4 == 0) goto L40
            boolean r4 = r4.isConnected()
            if (r4 == 0) goto L40
            android.net.Network r4 = r0.getActiveNetwork()
            if (r4 != 0) goto L28
            goto L40
        L28:
            android.net.NetworkCapabilities r4 = r0.getNetworkCapabilities(r4)     // Catch: java.lang.SecurityException -> L34
            if (r4 == 0) goto L40
            boolean r4 = r4.hasCapability(r2)     // Catch: java.lang.SecurityException -> L34
            if (r4 == 0) goto L40
        L34:
            r4 = r7 & 2
            if (r4 == 0) goto L42
            boolean r0 = r0.isActiveNetworkMetered()
            if (r0 == 0) goto L42
            r3 = r1
            goto L42
        L40:
            r3 = r7 & 3
        L42:
            r0 = r7 & 8
            r4 = 0
            if (r0 == 0) goto L64
            android.content.IntentFilter r0 = new android.content.IntentFilter
            java.lang.String r5 = "android.intent.action.BATTERY_CHANGED"
            r0.<init>(r5)
            android.content.Intent r0 = r8.registerReceiver(r4, r0)
            if (r0 != 0) goto L55
            goto L62
        L55:
            java.lang.String r5 = "status"
            r6 = -1
            int r0 = r0.getIntExtra(r5, r6)
            if (r0 == r1) goto L64
            r1 = 5
            if (r0 != r1) goto L62
            goto L64
        L62:
            r3 = r3 | 8
        L64:
            r0 = r7 & 4
            if (r0 == 0) goto L7b
            java.lang.String r0 = "power"
            java.lang.Object r0 = r8.getSystemService(r0)
            r0.getClass()
            android.os.PowerManager r0 = (android.os.PowerManager) r0
            boolean r0 = r0.isDeviceIdleMode()
            if (r0 != 0) goto L7b
            r3 = r3 | 4
        L7b:
            r7 = r7 & r2
            if (r7 == 0) goto L8e
            android.content.IntentFilter r7 = new android.content.IntentFilter
            java.lang.String r0 = "android.intent.action.DEVICE_STORAGE_LOW"
            r7.<init>(r0)
            android.content.Intent r7 = r8.registerReceiver(r4, r7)
            if (r7 != 0) goto L8c
            goto L8e
        L8c:
            r3 = r3 | 16
        L8e:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.u35.a(android.content.Context):int");
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && u35.class == obj.getClass()) {
            if (this.x == ((u35) obj).x) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return this.x;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.x);
    }
}
