package b4;

import android.os.ParcelFileDescriptor;
import android.util.Log;
import java.io.ByteArrayInputStream;
import java.io.Closeable;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;

/* loaded from: classes.dex */
public final class i implements com.bumptech.glide.load.data.e {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f1463a;

    /* renamed from: b, reason: collision with root package name */
    public Closeable f1464b;

    /* renamed from: c, reason: collision with root package name */
    public final Object f1465c;

    /* renamed from: d, reason: collision with root package name */
    public final Object f1466d;

    public /* synthetic */ i(int i10, Object obj, Object obj2) {
        this.f1463a = i10;
        this.f1465c = obj;
        this.f1466d = obj2;
    }

    @Override // com.bumptech.glide.load.data.e
    public final Class a() {
        int i10 = this.f1463a;
        Object obj = this.f1466d;
        switch (i10) {
            case 0:
                switch (((k3.d) obj).f6452a) {
                    case 8:
                        return ByteBuffer.class;
                    default:
                        return InputStream.class;
                }
            default:
                switch (((f9.x) ((n) obj)).f4108a) {
                    case 1:
                        return ParcelFileDescriptor.class;
                    default:
                        return InputStream.class;
                }
        }
    }

    @Override // com.bumptech.glide.load.data.e
    public final void c() {
        int i10 = this.f1463a;
        Object obj = this.f1466d;
        switch (i10) {
            case 0:
                try {
                    Closeable closeable = this.f1464b;
                    ((k3.d) obj).getClass();
                    ((InputStream) closeable).close();
                    return;
                } catch (IOException unused) {
                    return;
                }
            default:
                Closeable closeable2 = this.f1464b;
                if (closeable2 != null) {
                    try {
                        switch (((f9.x) ((n) obj)).f4108a) {
                            case 1:
                                ((ParcelFileDescriptor) closeable2).close();
                                break;
                            default:
                                ((InputStream) closeable2).close();
                                break;
                        }
                        return;
                    } catch (IOException unused2) {
                        return;
                    }
                }
                return;
        }
    }

    @Override // com.bumptech.glide.load.data.e
    public final void cancel() {
    }

    @Override // com.bumptech.glide.load.data.e
    public final v3.a d() {
        return v3.a.LOCAL;
    }

    @Override // com.bumptech.glide.load.data.e
    public final void e(com.bumptech.glide.g gVar, com.bumptech.glide.load.data.d dVar) {
        Closeable open;
        int i10 = this.f1463a;
        Object obj = this.f1465c;
        Object obj2 = this.f1466d;
        switch (i10) {
            case 0:
                try {
                    ((k3.d) obj2).getClass();
                    ByteArrayInputStream c6 = k3.d.c((String) obj);
                    this.f1464b = c6;
                    dVar.s(c6);
                    return;
                } catch (IllegalArgumentException e10) {
                    dVar.n(e10);
                    return;
                }
            default:
                try {
                    File file = (File) obj;
                    switch (((f9.x) ((n) obj2)).f4108a) {
                        case 1:
                            open = ParcelFileDescriptor.open(file, 268435456);
                            break;
                        default:
                            open = new FileInputStream(file);
                            break;
                    }
                    this.f1464b = open;
                    dVar.s(open);
                    return;
                } catch (FileNotFoundException e11) {
                    if (Log.isLoggable("FileLoader", 3)) {
                        Log.d("FileLoader", "Failed to open file", e11);
                    }
                    dVar.n(e11);
                    return;
                }
        }
    }
}
