package p6;

import android.os.IBinder;
import android.os.IInterface;

/* loaded from: classes.dex */
public abstract class a implements IInterface {

    /* renamed from: a, reason: collision with root package name */
    public final IBinder f8599a;

    /* renamed from: b, reason: collision with root package name */
    public final String f8600b;

    public a(IBinder iBinder, String str) {
        this.f8599a = iBinder;
        this.f8600b = str;
    }

    @Override // android.os.IInterface
    public final IBinder asBinder() {
        return this.f8599a;
    }
}
