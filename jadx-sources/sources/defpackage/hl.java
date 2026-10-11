package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public final class hl {
    public static final hl x;
    public static final hl y;
    public static final /* synthetic */ hl[] z;

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Enum, hl] */
    /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Enum, hl] */
    static {
        ?? r0 = new Enum("BoundReached", 0);
        x = r0;
        ?? r1 = new Enum("Finished", 1);
        y = r1;
        z = new hl[]{r0, r1};
    }

    public static hl valueOf(String str) {
        return (hl) Enum.valueOf(hl.class, str);
    }

    public static hl[] values() {
        return (hl[]) z.clone();
    }
}
