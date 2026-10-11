package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public final class u55 {
    public static final u55 A;
    public static final u55 B;
    public static final /* synthetic */ u55[] C;
    public static final u55 x;
    public static final u55 y;
    public static final u55 z;

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Enum, u55] */
    /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Enum, u55] */
    /* JADX WARN: Type inference failed for: r2v2, types: [java.lang.Enum, u55] */
    /* JADX WARN: Type inference failed for: r3v2, types: [java.lang.Enum, u55] */
    /* JADX WARN: Type inference failed for: r4v2, types: [java.lang.Enum, u55] */
    static {
        ?? r0 = new Enum("RewardEarned", 0);
        x = r0;
        ?? r1 = new Enum("Skipped", 1);
        y = r1;
        ?? r2 = new Enum("Unavailable", 2);
        z = r2;
        ?? r3 = new Enum("AlreadyShowing", 3);
        A = r3;
        ?? r4 = new Enum("NotConfigured", 4);
        B = r4;
        C = new u55[]{r0, r1, r2, r3, r4};
    }

    public static u55 valueOf(String str) {
        return (u55) Enum.valueOf(u55.class, str);
    }

    public static u55[] values() {
        return (u55[]) C.clone();
    }
}
