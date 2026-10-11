.class public final Lcom/google/android/gms/common/api/k;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field public static final c:Lcom/google/android/gms/common/api/k;


# instance fields
.field public final a:Lcom/google/android/gms/common/api/internal/t;

.field public final b:Landroid/os/Looper;


# direct methods
.method public static constructor <clinit>()V
    .locals 3

    .line 1
    new-instance v0, Lf9/x;

    .line 2
    .line 3
    const/16 v1, 0x1c

    .line 4
    .line 5
    invoke-direct {v0, v1}, Lf9/x;-><init>(I)V

    .line 6
    .line 7
    .line 8
    invoke-static {}, Landroid/os/Looper;->getMainLooper()Landroid/os/Looper;

    .line 9
    .line 10
    .line 11
    move-result-object v1

    .line 12
    new-instance v2, Lcom/google/android/gms/common/api/k;

    .line 13
    .line 14
    invoke-direct {v2, v0, v1}, Lcom/google/android/gms/common/api/k;-><init>(Lcom/google/android/gms/common/api/internal/t;Landroid/os/Looper;)V

    .line 15
    .line 16
    .line 17
    sput-object v2, Lcom/google/android/gms/common/api/k;->c:Lcom/google/android/gms/common/api/k;

    .line 18
    .line 19
    return-void
.end method

.method public constructor <init>(Lcom/google/android/gms/common/api/internal/t;Landroid/os/Looper;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lcom/google/android/gms/common/api/k;->a:Lcom/google/android/gms/common/api/internal/t;

    .line 5
    .line 6
    iput-object p2, p0, Lcom/google/android/gms/common/api/k;->b:Landroid/os/Looper;

    .line 7
    .line 8
    return-void
.end method
