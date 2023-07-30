# Git Branch Naming Conventions

When working with Git, having a consistent and descriptive branch naming convention is vital for promoting effective
collaboration and maintaining a well-organized development process. This document outlines the recommended branch naming
practices that ensure clarity and cohesion within the team.
---

## Branch Naming Structure

A well-formed Git branch name should follow the following structure:

```
<category>/<issue-tracker-ID-or-reference>/<short-descriptor-in-hyphenated-words>
```

---

### Category

Begin the branch name with a category that indicates the type of task being performed. Choose from the following
categories:

- `feat`: Denotes the addition or enhancement of a new feature.
- `fix`: Signifies the resolution of a bug or issue.
- `refactor`: Indicates code refactoring or improvement without changing functionality.
- `chore`: Represents general maintenance or housekeeping tasks.
- `docs`: Used for documentation-related changes.
- `style`: For changes related to code style or formatting.
- `test`: Pertaining to the addition or improvement of tests.

---

### Issue Tracker ID or Reference

Following the category, include the issue tracker ID or any relevant reference that links the branch to the
corresponding task. If no specific issue is associated, use a brief descriptor instead.
---

### Short Descriptor

After the issue tracker ID or reference, add a concise but descriptive term in "hyphenated-words" format that provides
an overview of the purpose of the branch.
---

## Examples

Let's explore some examples of well-structured branch names:

- Adding a new feature to handle user authentication:

```
feat/issue-123/user-authentication
```

---

- Fixing a bug related to data processing:

```
fix/issue-456/data-processing-bug
```

---

- Refactoring the database connection code:

```
refactor/issue-789/database-connection-refactor
```

---

- Performing general code cleanup and optimizing imports:

```
chore/no-ref/code-cleanup-import-optimize
```

---

- Updating project documentation for API endpoints:

```
docs/issue-987/update-api-documentation
```

---

- Applying consistent code style to views.py:

```
style/no-ref/views-py-code-style
```

---

- Adding unit tests for the email notification module:

```
test/issue-246/unit-tests-email-notifications
```

---

Let's embrace these branch naming conventions to ensure our Git history remains clear and informative. With
well-structured branch names, we can easily manage the progress of our projects and foster effective collaboration.

If you have any questions or suggestions about these conventions, I encourage you to share them. Your input is valued as
we strive to make our development workflow even more efficient.

Happy coding! 🚀

---