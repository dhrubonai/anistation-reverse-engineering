package defpackage;

import com.anistation.model.Resource;
import com.anistation.model.update.AppUpdateCheck;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public final class hr extends t36 implements ic2 {
    public final /* synthetic */ sb2 A;
    public final /* synthetic */ kr B;
    public final /* synthetic */ boolean C;
    public AppUpdateCheck x;
    public boolean y;
    public /* synthetic */ Object z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public hr(sb2 sb2Var, kr krVar, boolean z, vz0 vz0Var) {
        super(2, vz0Var);
        this.A = sb2Var;
        this.B = krVar;
        this.C = z;
    }

    @Override // defpackage.h30
    public final vz0 create(Object obj, vz0 vz0Var) {
        hr hrVar = new hr(this.A, this.B, this.C, vz0Var);
        hrVar.z = obj;
        return hrVar;
    }

    @Override // defpackage.ic2
    public final Object invoke(Object obj, Object obj2) {
        return ((hr) create((Resource) obj, (vz0) obj2)).invokeSuspend(pn6.a);
    }

    /*  JADX ERROR: JadxRuntimeException in pass: BlockProcessor
        jadx.core.utils.exceptions.JadxRuntimeException: CFG modification limit reached, blocks count: 167
        	at jadx.core.dex.visitors.blocks.BlockProcessor.processBlocksTree(BlockProcessor.java:64)
        	at jadx.core.dex.visitors.blocks.BlockProcessor.visit(BlockProcessor.java:44)
        */
    @Override // defpackage.h30
    public final java.lang.Object invokeSuspend(java.lang.Object r12) {
        /*
            Method dump skipped, instructions count: 324
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.hr.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
