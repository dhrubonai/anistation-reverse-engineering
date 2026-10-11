.class public final Landroidx/concurrent/futures/i;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field public static final c:Landroidx/concurrent/futures/i;


# instance fields
.field public volatile a:Ljava/lang/Thread;

.field public volatile b:Landroidx/concurrent/futures/i;


# direct methods
.method public static constructor <clinit>()V
    .locals 2

    .line 1
    new-instance v0, Landroidx/concurrent/futures/i;

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    invoke-direct {v0, v1}, Landroidx/concurrent/futures/i;-><init>(I)V

    .line 5
    .line 6
    .line 7
    sput-object v0, Landroidx/concurrent/futures/i;->c:Landroidx/concurrent/futures/i;

    .line 8
    .line 9
    return-void
.end method

.method public constructor <init>()V
    .locals 2

    .line 2
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 3
    sget-object v0, Landroidx/concurrent/futures/j;->ATOMIC_HELPER:Landroidx/concurrent/futures/a;

    invoke-static {}, Ljava/lang/Thread;->currentThread()Ljava/lang/Thread;

    move-result-object v1

    invoke-virtual {v0, p0, v1}, Landroidx/concurrent/futures/a;->e(Landroidx/concurrent/futures/i;Ljava/lang/Thread;)V

    return-void
.end method

.method public constructor <init>(I)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method
