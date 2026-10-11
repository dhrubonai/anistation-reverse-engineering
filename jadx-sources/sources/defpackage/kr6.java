package defpackage;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public interface kr6 {
    boolean b();

    long e(rl rlVar, rl rlVar2, rl rlVar3);

    rl o(long j, rl rlVar, rl rlVar2, rl rlVar3);

    rl y(long j, rl rlVar, rl rlVar2, rl rlVar3);

    default rl z(rl rlVar, rl rlVar2, rl rlVar3) {
        return o(e(rlVar, rlVar2, rlVar3), rlVar, rlVar2, rlVar3);
    }
}
