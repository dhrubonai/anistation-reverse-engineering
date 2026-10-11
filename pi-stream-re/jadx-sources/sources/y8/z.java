package y8;

import java.io.File;
import java.io.FileInputStream;
import java.util.logging.Logger;

/* loaded from: classes.dex */
public final class z extends b0 {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ s f11852b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ File f11853c;

    public z(File file, s sVar) {
        this.f11852b = sVar;
        this.f11853c = file;
    }

    @Override // y8.b0
    public final long a() {
        return this.f11853c.length();
    }

    @Override // y8.b0
    public final s b() {
        return this.f11852b;
    }

    @Override // y8.b0
    public final void c(k9.h hVar) {
        Logger logger = k9.n.f6536a;
        File file = this.f11853c;
        r6.h0.u(file, "<this>");
        k9.d dVar = new k9.d(new FileInputStream(file), k9.y.f6558d);
        try {
            hVar.e(dVar);
            r6.h0.A(dVar, null);
        } finally {
        }
    }
}
