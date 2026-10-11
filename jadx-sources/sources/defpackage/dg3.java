package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public final class dg3 {
    private static final /* synthetic */ sv1 $ENTRIES;
    private static final /* synthetic */ dg3[] $VALUES;
    public static final bg3 Companion;
    public static final dg3 ON_ANY;
    public static final dg3 ON_CREATE;
    public static final dg3 ON_DESTROY;
    public static final dg3 ON_PAUSE;
    public static final dg3 ON_RESUME;
    public static final dg3 ON_START;
    public static final dg3 ON_STOP;

    /* JADX WARN: Type inference failed for: r0v0, types: [dg3, java.lang.Enum] */
    /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, bg3] */
    /* JADX WARN: Type inference failed for: r1v1, types: [dg3, java.lang.Enum] */
    /* JADX WARN: Type inference failed for: r2v2, types: [dg3, java.lang.Enum] */
    /* JADX WARN: Type inference failed for: r3v2, types: [dg3, java.lang.Enum] */
    /* JADX WARN: Type inference failed for: r4v2, types: [dg3, java.lang.Enum] */
    /* JADX WARN: Type inference failed for: r5v2, types: [dg3, java.lang.Enum] */
    /* JADX WARN: Type inference failed for: r6v2, types: [dg3, java.lang.Enum] */
    static {
        ?? r0 = new Enum("ON_CREATE", 0);
        ON_CREATE = r0;
        ?? r1 = new Enum("ON_START", 1);
        ON_START = r1;
        ?? r2 = new Enum("ON_RESUME", 2);
        ON_RESUME = r2;
        ?? r3 = new Enum("ON_PAUSE", 3);
        ON_PAUSE = r3;
        ?? r4 = new Enum("ON_STOP", 4);
        ON_STOP = r4;
        ?? r5 = new Enum("ON_DESTROY", 5);
        ON_DESTROY = r5;
        ?? r6 = new Enum("ON_ANY", 6);
        ON_ANY = r6;
        dg3[] dg3VarArr = {r0, r1, r2, r3, r4, r5, r6};
        $VALUES = dg3VarArr;
        $ENTRIES = new tv1(dg3VarArr);
        Companion = new Object();
    }

    public static dg3 valueOf(String str) {
        return (dg3) Enum.valueOf(dg3.class, str);
    }

    public static dg3[] values() {
        return (dg3[]) $VALUES.clone();
    }

    public final eg3 a() {
        switch (cg3.a[ordinal()]) {
            case 1:
            case 2:
                return eg3.z;
            case 3:
            case 4:
                return eg3.A;
            case 5:
                return eg3.B;
            case 6:
                return eg3.x;
            case 7:
                throw new IllegalArgumentException(this + " has no target state");
            default:
                ze0.l();
                return null;
        }
    }
}
