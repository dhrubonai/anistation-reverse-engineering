package t7;

/* loaded from: classes.dex */
public class w extends p7.a implements b7.d {

    /* renamed from: d, reason: collision with root package name */
    public final z6.e f10089d;

    public w(z6.e eVar, z6.i iVar) {
        super(iVar, true);
        this.f10089d = eVar;
    }

    @Override // p7.k1
    public final boolean G() {
        return true;
    }

    @Override // b7.d
    public final b7.d getCallerFrame() {
        z6.e eVar = this.f10089d;
        if (eVar instanceof b7.d) {
            return (b7.d) eVar;
        }
        return null;
    }

    @Override // p7.k1
    public void i(Object obj) {
        j.a(com.bumptech.glide.d.F(this.f10089d), com.bumptech.glide.c.d0(obj), null);
    }

    @Override // p7.k1
    public void j(Object obj) {
        this.f10089d.resumeWith(com.bumptech.glide.c.d0(obj));
    }
}
