package k3;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.util.Objects;

/* loaded from: classes.dex */
public final class k {

    /* renamed from: a, reason: collision with root package name */
    public final int f6457a;

    /* renamed from: b, reason: collision with root package name */
    public final int f6458b;

    /* renamed from: c, reason: collision with root package name */
    public final long f6459c;

    /* renamed from: d, reason: collision with root package name */
    public final long f6460d;

    public k(int i10, int i11, long j4, long j10) {
        this.f6457a = i10;
        this.f6458b = i11;
        this.f6459c = j4;
        this.f6460d = j10;
    }

    public static k a(File file) {
        DataInputStream dataInputStream = new DataInputStream(new FileInputStream(file));
        try {
            k kVar = new k(dataInputStream.readInt(), dataInputStream.readInt(), dataInputStream.readLong(), dataInputStream.readLong());
            dataInputStream.close();
            return kVar;
        } catch (Throwable th) {
            try {
                dataInputStream.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    public final void b(File file) {
        file.delete();
        DataOutputStream dataOutputStream = new DataOutputStream(new FileOutputStream(file));
        try {
            dataOutputStream.writeInt(this.f6457a);
            dataOutputStream.writeInt(this.f6458b);
            dataOutputStream.writeLong(this.f6459c);
            dataOutputStream.writeLong(this.f6460d);
            dataOutputStream.close();
        } catch (Throwable th) {
            try {
                dataOutputStream.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof k)) {
            return false;
        }
        k kVar = (k) obj;
        if (this.f6458b == kVar.f6458b && this.f6459c == kVar.f6459c && this.f6457a == kVar.f6457a && this.f6460d == kVar.f6460d) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Objects.hash(Integer.valueOf(this.f6458b), Long.valueOf(this.f6459c), Integer.valueOf(this.f6457a), Long.valueOf(this.f6460d));
    }
}
