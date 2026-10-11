package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public final class d05 {
    public static final d05 A;
    public static final d05 B;
    public static final d05 C;
    public static final /* synthetic */ d05[] D;
    public static final d05 x;
    public static final d05 y;
    public static final d05 z;

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Enum, d05] */
    /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Enum, d05] */
    /* JADX WARN: Type inference failed for: r2v2, types: [java.lang.Enum, d05] */
    /* JADX WARN: Type inference failed for: r3v2, types: [java.lang.Enum, d05] */
    /* JADX WARN: Type inference failed for: r4v2, types: [java.lang.Enum, d05] */
    /* JADX WARN: Type inference failed for: r5v2, types: [java.lang.Enum, d05] */
    static {
        ?? r0 = new Enum("ShutDown", 0);
        x = r0;
        ?? r1 = new Enum("ShuttingDown", 1);
        y = r1;
        ?? r2 = new Enum("Inactive", 2);
        z = r2;
        ?? r3 = new Enum("InactivePendingWork", 3);
        A = r3;
        ?? r4 = new Enum("Idle", 4);
        B = r4;
        ?? r5 = new Enum("PendingWork", 5);
        C = r5;
        D = new d05[]{r0, r1, r2, r3, r4, r5};
    }

    public static d05 valueOf(String str) {
        return (d05) Enum.valueOf(d05.class, str);
    }

    public static d05[] values() {
        return (d05[]) D.clone();
    }
}
