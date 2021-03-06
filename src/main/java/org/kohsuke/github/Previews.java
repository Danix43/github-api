package org.kohsuke.github;

/**
 * Provides the media type strings for GitHub API previews
 *
 * https://developer.github.com/v3/previews/
 *
 * @author Kohsuke Kawaguchi
 */
class Previews {
    /**
     * Check-runs and check-suites
     *
     * @see <a href="https://developer.github.com/v3/previews/#check-runs-and-check-suites-api">GitHub API Previews</a>
     */
    static final String ANTIOPE = "application/vnd.github.antiope-preview+json";

    /**
     * Enhanced Deployments
     *
     * @see <a href="https://developer.github.com/v3/previews/#enhanced-deployments">GitHub API Previews</a>
     */
    static final String ANT_MAN = "application/vnd.github.ant-man-preview+json";

    /**
     * Create repository from template repository
     *
     * @see <a href="https://developer.github.com/v3/previews/#create-and-use-repository-templates">GitHub API
     *      Previews</a>
     */
    static final String BAPTISE = "application/vnd.github.baptiste-preview+json";

    /**
     * Commit Search
     *
     * @see <a href="https://developer.github.com/v3/previews/#commit-search">GitHub API Previews</a>
     */
    static final String CLOAK = "application/vnd.github.cloak-preview+json";

    /**
     * New deployment statuses and support for updating deployment status environment
     *
     * @see <a href="https://developer.github.com/v3/previews/#deployment-statuses">GitHub API Previews</a>
     */
    static final String FLASH = "application/vnd.github.flash-preview+json";

    /**
     * Owners of GitHub Apps can now uninstall an app using the Apps API
     *
     * @see <a href="https://developer.github.com/v3/previews/#uninstall-a-github-app">GitHub API Previews</a>
     */
    static final String GAMBIT = "application/vnd.github.gambit-preview+json";

    /**
     * List branches or pull requests for a commit
     *
     * @see <a href="https://developer.github.com/v3/previews/#list-branches-or-pull-requests-for-a-commit">GitHub API
     *      Previews</a>
     */
    static final String GROOT = "application/vnd.github.groot-preview+json";

    /**
     * Manage projects
     *
     * @see <a href="https://developer.github.com/v3/previews/#projects">GitHub API Previews</a>
     */
    static final String INERTIA = "application/vnd.github.inertia-preview+json";

    /**
     * Update a pull request branch
     *
     * @see <a href="https://developer.github.com/v3/previews/#update-a-pull-request-branch">GitHub API Previews</a>
     */
    static final String LYDIAN = "application/vnd.github.lydian-preview+json";

    /**
     * Require multiple approving reviews
     *
     * @see <a href="https://developer.github.com/v3/previews/#require-multiple-approving-reviews">GitHub API
     *      Previews</a>
     */
    static final String LUKE_CAGE = "application/vnd.github.luke-cage-preview+json";

    /**
     * Manage integrations through the API
     *
     * @see <a href="https://developer.github.com/v3/previews/#integrations">GitHub API Previews</a>
     */
    static final String MACHINE_MAN = "application/vnd.github.machine-man-preview+json";

    /**
     * View a list of repository topics in calls that return repository results
     *
     * @see <a href="https://developer.github.com/v3/previews/#repository-topics">GitHub API Previews</a>
     */
    static final String MERCY = "application/vnd.github.mercy-preview+json";

    /**
     * New visibility parameter for the Repositories API
     *
     * @see <a href="https://developer.github.com/v3/previews/#new-visibility-parameter-for-the-repositories-api">GitHub
     *      API Previews</a>
     */
    static final String NEBULA = "application/vnd.github.nebula-preview+json";

    /**
     * Draft pull requests
     *
     * @see <a href="https://developer.github.com/v3/previews/#draft-pull-requests">GitHub API Previews</a>
     */
    static final String SHADOW_CAT = "application/vnd.github.shadow-cat-preview+json";

    /**
     * Reactions
     *
     * @see <a href="https://developer.github.com/v3/previews/#reactions">GitHub API Previews</a>
     */
    static final String SQUIRREL_GIRL = "application/vnd.github.squirrel-girl-preview+json";

    /**
     * Require signed commits
     *
     * @see <a href="https://developer.github.com/v3/previews/#require-signed-commits">GitHub API Previews</a>
     */
    static final String ZZZAX = "application/vnd.github.zzzax-preview+json";

}
