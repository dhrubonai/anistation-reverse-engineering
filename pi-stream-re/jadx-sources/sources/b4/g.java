package b4;

import android.util.Log;
import java.io.File;
import java.io.IOException;
import java.nio.ByteBuffer;

/* loaded from: classes.dex */
public final class g implements com.bumptech.glide.load.data.e {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f1458a;

    /* renamed from: b, reason: collision with root package name */
    public final Object f1459b;

    public /* synthetic */ g(Object obj, int i10) {
        this.f1458a = i10;
        this.f1459b = obj;
    }

    @Override // com.bumptech.glide.load.data.e
    public final Class a() {
        switch (this.f1458a) {
            case 0:
                return ByteBuffer.class;
            default:
                return this.f1459b.getClass();
        }
    }

    @Override // com.bumptech.glide.load.data.e
    public final void c() {
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
        int i10 = this.f1458a;
        Object obj = this.f1459b;
        switch (i10) {
            case 0:
                try {
                    dVar.s(p4.b.a((File) obj));
                    return;
                } catch (IOException e10) {
                    if (Log.isLoggable("ByteBufferFileLoader", 3)) {
                        Log.d("ByteBufferFileLoader", "Failed to obtain ByteBuffer for file", e10);
                    }
                    dVar.n(e10);
                    return;
                }
            default:
                dVar.s(obj);
                return;
        }
    }
}
