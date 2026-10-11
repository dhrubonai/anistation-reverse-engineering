.class final Lcom/google/android/gms/internal/auth-api/zbbb;
.super Lcom/google/android/gms/common/api/a;
.source "SourceFile"


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 1
    invoke-direct {p0}, Lcom/google/android/gms/common/api/a;-><init>()V

    .line 2
    .line 3
    .line 4
    return-void
.end method


# virtual methods
.method public final synthetic buildClient(Landroid/content/Context;Landroid/os/Looper;Lcom/google/android/gms/common/internal/h;Ljava/lang/Object;Lcom/google/android/gms/common/api/internal/g;Lcom/google/android/gms/common/api/internal/p;)Lcom/google/android/gms/common/api/g;
    .locals 7

    .line 1
    const/4 v3, 0x0

    .line 2
    invoke-static {p4}, La3/g;->z(Ljava/lang/Object;)V

    .line 3
    .line 4
    .line 5
    new-instance p4, Lcom/google/android/gms/internal/auth-api/zbbh;

    .line 6
    .line 7
    move-object v0, p4

    .line 8
    move-object v1, p1

    .line 9
    move-object v2, p2

    .line 10
    move-object v4, p3

    .line 11
    move-object v5, p5

    .line 12
    move-object v6, p6

    .line 13
    invoke-direct/range {v0 .. v6}, Lcom/google/android/gms/internal/auth-api/zbbh;-><init>(Landroid/content/Context;Landroid/os/Looper;Lw4/r;Lcom/google/android/gms/common/internal/h;Lcom/google/android/gms/common/api/internal/g;Lcom/google/android/gms/common/api/internal/p;)V

    .line 14
    .line 15
    .line 16
    return-object p4
.end method
