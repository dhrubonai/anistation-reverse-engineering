.class public final Landroidx/activity/q;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroidx/activity/a;


# instance fields
.field public final a:Landroidx/fragment/app/k0;

.field public final synthetic b:Landroidx/activity/r;


# direct methods
.method public constructor <init>(Landroidx/activity/r;Landroidx/fragment/app/k0;)V
    .locals 0

    .line 1
    iput-object p1, p0, Landroidx/activity/q;->b:Landroidx/activity/r;

    .line 2
    .line 3
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 4
    .line 5
    .line 6
    iput-object p2, p0, Landroidx/activity/q;->a:Landroidx/fragment/app/k0;

    .line 7
    .line 8
    return-void
.end method


# virtual methods
.method public final cancel()V
    .locals 3

    .line 1
    iget-object v0, p0, Landroidx/activity/q;->b:Landroidx/activity/r;

    .line 2
    .line 3
    iget-object v1, v0, Landroidx/activity/r;->b:Ljava/util/ArrayDeque;

    .line 4
    .line 5
    iget-object v2, p0, Landroidx/activity/q;->a:Landroidx/fragment/app/k0;

    .line 6
    .line 7
    invoke-virtual {v1, v2}, Ljava/util/ArrayDeque;->remove(Ljava/lang/Object;)Z

    .line 8
    .line 9
    .line 10
    iget-object v1, v2, Landroidx/fragment/app/k0;->b:Ljava/util/concurrent/CopyOnWriteArrayList;

    .line 11
    .line 12
    invoke-virtual {v1, p0}, Ljava/util/concurrent/CopyOnWriteArrayList;->remove(Ljava/lang/Object;)Z

    .line 13
    .line 14
    .line 15
    invoke-static {}, Lcom/bumptech/glide/d;->G()Z

    .line 16
    .line 17
    .line 18
    move-result v1

    .line 19
    if-eqz v1, :cond_0

    .line 20
    .line 21
    const/4 v1, 0x0

    .line 22
    iput-object v1, v2, Landroidx/fragment/app/k0;->c:Lf0/a;

    .line 23
    .line 24
    invoke-virtual {v0}, Landroidx/activity/r;->b()V

    .line 25
    .line 26
    .line 27
    :cond_0
    return-void
.end method
