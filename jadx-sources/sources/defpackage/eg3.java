package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public final class eg3 {
    public static final eg3 A;
    public static final eg3 B;
    public static final /* synthetic */ eg3[] C;
    public static final eg3 x;
    public static final eg3 y;
    public static final eg3 z;

    /* JADX WARN: Type inference failed for: r0v0, types: [eg3, java.lang.Enum] */
    /* JADX WARN: Type inference failed for: r1v1, types: [eg3, java.lang.Enum] */
    /* JADX WARN: Type inference failed for: r2v2, types: [eg3, java.lang.Enum] */
    /* JADX WARN: Type inference failed for: r3v2, types: [eg3, java.lang.Enum] */
    /* JADX WARN: Type inference failed for: r4v2, types: [eg3, java.lang.Enum] */
    static {
        ?? r0 = new Enum("DESTROYED", 0);
        x = r0;
        ?? r1 = new Enum("INITIALIZED", 1);
        y = r1;
        ?? r2 = new Enum("CREATED", 2);
        z = r2;
        ?? r3 = new Enum("STARTED", 3);
        A = r3;
        ?? r4 = new Enum("RESUMED", 4);
        B = r4;
        C = new eg3[]{r0, r1, r2, r3, r4};
    }

    public static eg3 valueOf(String str) {
        return (eg3) Enum.valueOf(eg3.class, str);
    }

    public static eg3[] values() {
        return (eg3[]) C.clone();
    }
}
