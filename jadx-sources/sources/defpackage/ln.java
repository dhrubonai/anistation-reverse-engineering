package defpackage;

import com.anistation.model.animelist.ImportedAnime;
import java.util.Iterator;
import java.util.List;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public final class ln extends xz0 {
    public Iterator A;
    public ImportedAnime B;
    public String C;
    public boolean D;
    public long E;
    public /* synthetic */ Object F;
    public final /* synthetic */ on G;
    public int H;
    public List x;
    public List y;
    public List z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ln(on onVar, xz0 xz0Var) {
        super(xz0Var);
        this.G = onVar;
    }

    @Override // defpackage.h30
    public final Object invokeSuspend(Object obj) {
        this.F = obj;
        this.H |= Integer.MIN_VALUE;
        return this.G.d(null, false, this);
    }
}
